document.getElementById("orderForm").addEventListener("submit", async function(e) {
  e.preventDefault();

  const order = {
    customerName: document.getElementById("customerName").value.trim(),
    productName: document.getElementById("productName").value.trim(),
    size: document.getElementById("size").value, // ✅ Capturing selected size
    quantity: parseInt(document.getElementById("quantity").value),
    price: parseFloat(document.getElementById("price").value),
    status: document.getElementById("status").value
  };

  try {
    const response = await fetch('http://localhost:8080/orders', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(order)
    });

    const result = await response.json();

    document.getElementById("result").innerHTML = `
      ✅ <b>Order submitted!</b><br><br>
      <b>Customer:</b> ${result.customerName}<br>
      <b>Product:</b> ${result.productName}<br>
      <b>Size:</b> ${result.size}<br> <!-- ✅ Displaying selected size -->
      <b>Quantity:</b> ${result.quantity}<br>
      <b>Price:</b> ₹${result.price}<br>
      <b>Status:</b> ${result.status}
    `;

    console.log("Saved to database:", result);
  } catch (error) {
    console.error("Error saving order:", error);
    document.getElementById("result").innerHTML = "❌ Error saving order";
  }

  document.getElementById("orderForm").reset();
});
