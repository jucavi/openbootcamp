    $("video").hover(function() {
        $(this).prop("controls", true);
    }, function() {
        $(this).prop("controls", false);
    });
    $("video").click(function() {
        if( this.paused){
            this.play();
        }
        else {
            this.pause();
        }
    });
    
