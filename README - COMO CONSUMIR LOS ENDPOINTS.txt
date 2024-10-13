db.type=oracle

Añadir un Producto (POST)

Método: POST

URL: http://localhost:8080/products

Cuerpo (Body): Selecciona raw y JSON

json

{
  "id": "1",
  "description": "Producto de prueba",
  "price": 100.0
}
200



Obtener un Producto (GET)

Método: GET
URL: http://localhost:8080/products/1





Método: PUT

URL: http://localhost:8080/products

Cuerpo (Body): Usa el siguiente contenido:

json
{
  "id": "1",
  "description": "Producto actualizado",
  "price": 150.0
}
200

Eliminar un Producto (DELETE)

Método: DELETE
URL: http://localhost:8080/products/1
