/**
 * Encrypts the IMEI using AES encryption and returns the encrypted value as a Base64 encoded string.
 *
 * @param context
 * @return The Base64 encoded encrypted UUID.
 */
@OptIn(ExperimentalEncodingApi::class)
fun getUniqueIdentifier(context:Context): String {
    val secretKey = SecretKeySpec(UID_KEY.toByteArray(Charsets.UTF_8).copyOf(16), ALGORITHM)
    // Get the IMEI of the device to encrypt
    var identifier = DeviceUtils.getIMEI(context)
    if(TextUtils.isEmpty(identifier)) {
        identifier = getDeviceID(context)
    }
    // Initialize the cipher instance in encryption mode with the secret key and IV.
    val cipher = Cipher.getInstance(TRANSFORMATION)
    cipher.init(Cipher.ENCRYPT_MODE, secretKey, IvParameterSpec(iv))
    // Encrypt the IMEI and encode the result in Base64.
    val encrypted = cipher.doFinal(identifier.toByteArray(Charsets.UTF_8))
    val uniqueIdentifier = Base64.encode(encrypted)
    return uniqueIdentifier
}