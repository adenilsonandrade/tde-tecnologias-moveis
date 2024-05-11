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

class ProductAdapter(
    private val items: MutableList<Product>,
    private val goToDetail: (item: Product) -> Unit
) :
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        this.context = parent.context
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductAdapter.ViewHolder, position: Int) {
        holder.itemView.rootView.setOnClickListener {
            goToDetail(items[position])
        }

        holder.itemView.rootView.setOnLongClickListener {
            showPopupMenu(it, position)
            true
        }

        holder.nameProduct.text = items[position].name
        holder.genderProduct.text = items[position].gender
        holder.launchProduct.text = items[position].launch
        holder.priceProduct.text = items[position].price.convertToMoneyWithSymbol()
        holder.descriptionProduct.text = items[position].description

        Glide.with(context).load(items[position].urlImage).into(holder.imageProduct)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageProduct: ImageView = view.findViewById(R.id.tvImageProduct)
        val nameProduct: TextView = view.findViewById(R.id.tvProductName)
        val genderProduct: TextView = view.findViewById(R.id.tvProductGender)
        val launchProduct: TextView = view.findViewById(R.id.tvProductLaunch)
        val priceProduct: TextView = view.findViewById(R.id.tvProductPrice)
        val descriptionProduct: TextView = view.findViewById(R.id.tvProductDescription)
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

    fun removeItem(product: Product) {
        this.items.remove(product)
        notifyDataSetChanged()
    }
}