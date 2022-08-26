function initMap() {
    const barcelona = new google.maps.LatLng(41.3874, 2.1686)
    const paris = new google.maps.LatLng(48.8566, 2.3522)
    const newYork = new google.maps.LatLng(40.7128, 74.0060)


    const map = new google.maps.Map(document.getElementById('map'), {
        zoom: 4,
        center: barcelona,
    });

    const barcelonaMarker = new google.maps.Marker({
        position: barcelona,
        map: map,
        title: 'Barcelona'
    });

    const parisMarker = new google.maps.Marker({
        position: paris,
        map: map,
        title: 'Paris'
    });

    const newYorkMarker = new google.maps.Marker({
        position: newYork,
        map: map,
        title: 'New York'
    });

}

window.initMap = initMap