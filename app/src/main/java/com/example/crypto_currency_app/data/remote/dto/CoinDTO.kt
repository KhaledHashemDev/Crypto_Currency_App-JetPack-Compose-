package com.example.crypto_currency_app.data.remote.dto


import com.example.crypto_currency_app.domain.model.Coin
import com.google.gson.annotations.SerializedName

/**
 * DTO stands for Data Transfer Object
 */
data class CoinDTO(
    val id: String,
    @SerializedName("is_active")
    val isActive: Boolean,
    @SerializedName("is_new")
    val isNew: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)


//another way of mapping data to domain
fun CoinDTO.toCoin(): Coin {
    return Coin(
        id = id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol =  symbol,
       // logo = CoinDetailLogo(logo = String()).logo
    )
}


