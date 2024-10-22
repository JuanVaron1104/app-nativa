package com.example.project_basic;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ProductListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        RecyclerView recyclerView = findViewById(R.id.recyclerView_products);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Datos de prueba
        List<String> products = new ArrayList<>();
        products.add("Producto 1");
        products.add("Producto 2");
        products.add("Producto 3");

        ProductAdapter adapter = new ProductAdapter(products);
        recyclerView.setAdapter(adapter);
    }
}
