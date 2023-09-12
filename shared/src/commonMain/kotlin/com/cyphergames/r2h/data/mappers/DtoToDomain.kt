package com.cyphergames.r2h.data.mappers

import com.cyphergames.r2h.data.network.models.RideDetailDto
import com.cyphergames.r2h.domain.models.RideDetails

fun RideDetailDto.toDomain(): RideDetails {
    return RideDetails(
        rideType = this.rideType,
        rideImg = this.rideImg
    )
}