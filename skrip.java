let balance = 1000;
let growthRate = 0; // Pertumbuhan per detik
let chosenAsset = null;

// Fungsi untuk memilih aset
function chooseAsset(asset) {
  chosenAsset = asset;
  document.getElementById('chosen-asset').textContent = asset;

  if (asset === 'stock') {
    growthRate = 0.1; // 0.1% pertumbuhan per detik
  } else if (asset === 'crypto') {
    growthRate = 0.2; // 0.2% pertumbuhan per detik
  } else if (asset === 'realestate') {
    growthRate = 0.05; // 0.05% pertumbuhan per detik
  }

  document.getElementById('growth-rate').textContent = growthRate;
}

// Fungsi untuk <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Halaman Pembuka</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <img src="logo.png" alt="Logo Aplikasi" class="logo">
        <h1>Selamat Datang di [Nama Aplikasi]</h1>
        <p>Mulai perjalanan Anda di dunia pertanian digital!</p>
        <div class="button-group">
            <button onclick="window.location.href='login.html'">Login</button>
            <button onclick="window.location.href='signup.html'">Signup</button>
        </div>
    </div>
</body>
</html> saldo setiap detik
setInterval(function() {
  if (chosenAsset) {
    balance += balance * (growthRate / 100);
    document.getElementById('balance').textContent = balance.toFixed(2);
  }
}, 1000);