// player.js

document.addEventListener("DOMContentLoaded", function() {
    const audioPlayer = document.getElementById('audioPlayer');

    audioPlayer.addEventListener('play', function() {
        console.log('Audio is playing');
        // Add your logic here, e.g., sending play event to the backend
    });

    audioPlayer.addEventListener('pause', function() {
        console.log('Audio is paused');
        // Add your logic here, e.g., sending pause event to the backend
    });

    audioPlayer.addEventListener('ended', function() {
        console.log('Audio has ended');
        // Add your logic here, e.g., sending end event to the backend
    });
});