/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package loymax.popup.sdk.models

import com.squareup.moshi.Json

/**
 * 
 *
 * @param clientId 
 * @param action 
 * @param reference 
 */

data class PopupRequest (

    @Json(name = "client_id")
    val clientId: kotlin.String? = null,

    @Json(name = "action")
    val action: kotlin.String? = null,

    @Json(name = "reference")
    val reference: kotlin.String? = null

)
