    $(document).ready( function(){
        $(".year-link").click( function(e){
            var target = $(e.target);
            var year = target.attr("id");
            document.location.hash = year;
            fetchFilms(year);
            return false;
        });
        if (document.location.hash){
            var year = document.location.hash.substr(1)
            fetchFilms(year);
        }
        function fetchFilms(year){
            showLoadingAnimation();
            $.ajax({
                method: "GET",
                url: document.location.pathname,
                data: {
                    ajax: true,
                    year: year
                },
                success: function(data){
                    setTimeout( function(){
                        showFilms(data);
                    }, 1500);  // add intentional delay to emphasize async UI
                },
                error: function(){
                    alert("Error loading films :(");
                }
            });
            $(".active").removeClass("active");
            $("#"+year).addClass("active");
        }
        function showLoadingAnimation(){
            $(".table").hide();
            $("#loading").show();
        }
        function showFilms(films){
            // console.log(films);
            var films_html = "";
            $.each(films, function(_, film){
                var film_html = "";
                film_html += "<tr class='film'>"
                    film_html += "<td class='film-title'>" + film["title"] + "</td>"
                    film_html += "<td class='film-nominations'>" + film["nominations"] + "</td>"
                    film_html += "<td class='film-awards'>" + film["awards"] + "</td>"
                    if (film["best_picture"]) {
                        film_html += "<td class='film-best-picture'><i class='glyphicon glyphicon-flag'></i></td>"
                    } else {
                        film_html += "<td class='film-best-picture'></td>"
                    }
                film_html += "</tr>"
                films_html += film_html;
            })
            $("#table-body").html(films_html);
            $(".table").show();
            $("#loading").hide();
        }
    });
