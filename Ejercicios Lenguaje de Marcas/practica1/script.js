document.getElementById('toggle').addEventListener('click', function() {
    const section = document.getElementById('novelas');
    if (section.style.display === 'none') {
        section.style.display = 'block';
        this.textContent = 'Ocultar Detalles';
    } else {
        section.style.display = 'none';
        this.textContent = 'Mostrar Detalles';
    }
});
