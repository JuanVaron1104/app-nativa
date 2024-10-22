package com.example.project_basic

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.project_basic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Enlaza el layout con el binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configura la toolbar
        setSupportActionBar(binding.toolbar)

        // Obtén el NavController desde el fragmento que está en el layout `content_main.xml`
        val navController = findNavController(R.id.nav_host_fragment_content_main)

        // Configura el AppBar con el NavController para sincronizar la barra de acción
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        // Acciones del botón flotante (si lo necesitas)
        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Reemplaza con tu propia acción", Snackbar.LENGTH_LONG)
                .setAction("Acción", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflar el menú; esto agrega los elementos de acción a la barra de herramientas si está presente.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Manejar los clics en los ítems de la barra de acción aquí.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        // Permite la navegación hacia arriba
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}
