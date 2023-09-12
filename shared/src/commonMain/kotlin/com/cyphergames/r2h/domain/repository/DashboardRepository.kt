package com.cyphergames.r2h.domain.repository

import com.cyphergames.r2h.domain.models.RideDetails
import kotlinx.coroutines.flow.Flow

interface DashboardRepository {

    suspend fun GetScrollBarDetails():Flow<List<RideDetails>>
}