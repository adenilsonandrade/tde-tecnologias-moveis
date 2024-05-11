package com.nintendostore

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview_menucontexto.convertToMoneyWithSymbol

class MainAdapter(
    private val items: MutableList<Console>,
    private val goToDetail: (item: Console) -> Unit
) :
    RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        this.context = parent.context
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.console_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainAdapter.ViewHolder, position: Int) {
        holder.itemView.rootView.setOnClickListener {
            goToDetail(items[position])
        }

        holder.itemView.rootView.setOnLongClickListener {
            showPopupMenu(it, position)
            true
        }

        holder.nameConsole.text = items[position].name
        holder.launchConsole.text = items[position].launch
        holder.priceConsole.text = items[position].price.convertToMoneyWithSymbol()
        holder.descriptionConsole.text = items[position].description

        Glide.with(context).load(items[position].urlImage).into(holder.imageConsole)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageConsole: ImageView = view.findViewById(R.id.tvImageConsole)
        val nameConsole: TextView = view.findViewById(R.id.tvConsoleName)
        val launchConsole: TextView = view.findViewById(R.id.tvConsoleLaunch)
        val priceConsole: TextView = view.findViewById(R.id.tvConsolePrice)
        val descriptionConsole: TextView = view.findViewById(R.id.tvConsoleDescription)
    }

    private fun showPopupMenu(view: View, position: Int) {
        PopupMenu(context, view).apply {
            setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.context_menu_item_remove -> {
                        removeItem(items[position])
                        true
                    }

                    else -> false
                }
            }
            inflate(R.menu.menu_popup)
            show()
        }
    }

    fun removeItem(Console: Console) {
        this.items.remove(Console)
        notifyDataSetChanged()
    }
}