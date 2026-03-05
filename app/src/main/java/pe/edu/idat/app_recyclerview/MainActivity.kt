package pe.edu.idat.app_recyclerview

import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import pe.edu.idat.app_recyclerview.adapter.PersonajeAdapter
import pe.edu.idat.app_recyclerview.databinding.ActivityMainBinding
import pe.edu.idat.app_recyclerview.model.Personaje

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.rvpersonajes.layoutManager = LinearLayoutManager(this)
        binding.rvpersonajes.adapter = PersonajeAdapter(getPersonajes())
    }

    fun getPersonajes(): List<Personaje>{
        return listOf(
            Personaje(1, "Julio Melendez", "Asistente", "https://www.citypng.com/public/uploads/preview/hd-man-user-illustration-icon-transparent-png-701751694974843ybexneueic.png"),
            Personaje(2, "Carlos Melendez", "Jefe", "https://www.citypng.com/public/uploads/preview/hd-man-user-illustration-icon-transparent-png-701751694974843ybexneueic.png"),
            Personaje(3, "Wilfredo Melendez", "Gerente", "https://www.citypng.com/public/uploads/preview/hd-man-user-illustration-icon-transparent-png-701751694974843ybexneueic.png"),
            Personaje(4, "Henry Melendez", "Analista", "https://www.citypng.com/public/uploads/preview/hd-man-user-illustration-icon-transparent-png-701751694974843ybexneueic.png"),
            Personaje(5, "Mario Melendez", "Lider Técnico", "https://www.citypng.com/public/uploads/preview/hd-man-user-illustration-icon-transparent-png-701751694974843ybexneueic.png")
        )
    }


}