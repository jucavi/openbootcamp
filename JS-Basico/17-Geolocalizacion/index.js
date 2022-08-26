let map;
let marker;

function initMap() {
    const position = {
        lat: -25.334,
        lng: 131.031
    }

    const map = new google.maps.Map(document.getElementById('map'), {
        zoom: 4,
        center: position,
    })

    const marker = new google.maps.Marker({
        position: position,
        map: map,
        title: 'Posición inicial'
    })


}

function posicionInicial() {
    if (navigator.geolocation) {
        const geoLoc = navigator.geolocation
        const options = { timeout: 60000 }
        const watchPos = geoLoc.watchPosition(centraMapa, onError, options)
    } else {
        alert('El navegador no admite geolocalización')
    }
}

function centraMapa(position) {
    const nuevaPos = {
        lat: position.coords.latitude,
        lng: position.coords.longitude
    }
    marker.setPosition(nuevaPos)
    map.setCenter(nuevaPos)
}

function onError(error) {
    console.log(error)
}

window.initMap = initMap