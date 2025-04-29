// checkout.js

document.getElementById("checkout-form").addEventListener("submit", function (e) {
    e.preventDefault();

    // Simulating checkout process
    const name = document.getElementById("full-name").value;
    const email = document.getElementById("email").value;
    const address = document.getElementById("address").value;
    const paymentMethod = document.getElementById("payment-method").value;

    if (name && email && address && paymentMethod) {
        alert("Your order has been successfully submitted! Proceeding to payment...");
        // Redirect to payment page
        window.location.href = "https://www.paypal.com/imdejecting@gmail.com";
    } else {
        alert("Please fill out all fields.");
    }
});
