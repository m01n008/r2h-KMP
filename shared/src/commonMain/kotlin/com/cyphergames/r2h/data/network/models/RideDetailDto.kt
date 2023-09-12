package com.cyphergames.r2h.data.network.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RideDetailDto(

    @SerialName("ride_type")
    val rideType: String? = null,

    @SerialName("ride_img")
    val rideImg: String? = null
)
