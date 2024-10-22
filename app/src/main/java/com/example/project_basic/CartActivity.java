package com.example.project_basic;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart); // Asegúrate de que el archivo XML esté correctamente nombrado

        // Configuramos el RecyclerView para mostrar el contenido del carrito
        RecyclerView recyclerView = findViewById(R.id.recyclerView_cart);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Datos de prueba (puedes sustituir esto con los productos del carrito real en un proyecto funcional)
        List<String> cartItems = new ArrayList<>();
        cartItems.add("Producto A");
        cartItems.add("Producto B");
        cartItems.add("Producto C");

        // Creamos el adaptador con la lista de productos del carrito
        CartAdapter adapter = new CartAdapter(cartItems);
        recyclerView.setAdapter(adapter);
    }
}