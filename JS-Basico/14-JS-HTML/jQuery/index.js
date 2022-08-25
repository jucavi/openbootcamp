// $(`selector`).(`accion`)
// $('li').hide();

// Similares
$(document).ready(() => {
});

$(() => {
    $('.hide-btn').click(() => {
        // $('.title').hide()
        $('.title').fadeOut()
    });

    $('.show-btn').click(() => {
        // $('.title').show();
        $('.title').fadeIn();
    });

    $('li').click(() => {
        $('.tile').css({ color: 'red' })
    });

    $('.new-element').click(() => {
        // $('ul').append('<li>New Element</li>')
        $('ul').prepend('<li>New Element</li>')
    });

    $('li').mouseenter((elem) => {
        elem.target.style.color = 'blue'
    });

    $('li').mouseleave((elem) => {
        elem.target.style.color = 'black'
    });
});
