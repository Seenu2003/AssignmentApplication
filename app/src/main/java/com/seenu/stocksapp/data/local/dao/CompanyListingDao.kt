package com.seenu.stocksapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.seenu.stocksapp.data.local.entities.CompanyListingEntity

@Dao
interface CompanyListingDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCompanyListings(
        companyListingEntities: List<CompanyListingEntity>
    )
    @Query("DELETE FROM company_listing")
    suspend fun clearCompanyListings()

    @Query("SELECT * FROM company_listing WHERE LOWER(name) LIKE '%' || LOWER(:query) || '%' OR UPPER(:query) == symbol")
    suspend fun searchCompanyListing(query: String): List<CompanyListingEntity>
}
