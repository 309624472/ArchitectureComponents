package com.feng.databinding_sample.kotlin.model

import android.os.Parcel
import android.os.Parcelable

class OrderEntity(
        var orderId: String,
        var status: String,
        var price: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(orderId)
        parcel.writeString(status)
        parcel.writeString(price)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<OrderEntity> {
        override fun createFromParcel(parcel: Parcel): OrderEntity {
            return OrderEntity(parcel)
        }

        override fun newArray(size: Int): Array<OrderEntity?> {
            return arrayOfNulls(size)
        }
    }

}