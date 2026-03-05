package pe.edu.idat.app_recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import pe.edu.idat.app_recyclerview.databinding.ItemPersonajeBinding
import pe.edu.idat.app_recyclerview.model.Personaje

class PersonajeAdapter(private var listPersonaje: List<Personaje>) :
    RecyclerView.Adapter<PersonajeAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemPersonajeBinding)
        : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PersonajeAdapter.ViewHolder {
        val binding = ItemPersonajeBinding.inflate(LayoutInflater.from(parent.context),
            parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonajeAdapter.ViewHolder, position: Int) {
        with(holder){
            with(listPersonaje[position]){
                binding.tvnombres.text = nombres
                binding.tvcargo.text = cargo
                Glide.with(itemView.context)
                    .load(urlimagen)
                    .into(binding.ivimagen)
            }
        }
    }

    override fun getItemCount() = listPersonaje.size

}