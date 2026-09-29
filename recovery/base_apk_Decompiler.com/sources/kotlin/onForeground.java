package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class onForeground extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ byte[] AudioAttributesCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onForeground(byte[] bArr) {
        super(0);
        this.AudioAttributesCompatParcelizer = bArr;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        Object codecneedsdiscardchannelsworkaround;
        DefaultAudioSinkApi31 codecneedsdiscardchannelsworkaround2;
        byte[] bArr = this.AudioAttributesCompatParcelizer;
        if (bArr.length < 4) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int iIconCompatParcelizer = setClientAuthToken.IconCompatParcelizer(bArr[0]) & 255;
        byte bIconCompatParcelizer = setClientAuthToken.IconCompatParcelizer((byte) setCustomerEmail.read(setCustomerEmail.read(iIconCompatParcelizer) + 3));
        byte bIconCompatParcelizer2 = setClientAuthToken.IconCompatParcelizer((byte) setCustomerEmail.read(setCustomerEmail.read(iIconCompatParcelizer) + 11));
        byte bIconCompatParcelizer3 = setClientAuthToken.IconCompatParcelizer((byte) setCustomerEmail.read(setCustomerEmail.read(iIconCompatParcelizer) + 12));
        if (setClientAuthToken.IconCompatParcelizer(this.AudioAttributesCompatParcelizer[1]) != bIconCompatParcelizer) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new setClientAuthToken[]{setClientAuthToken.AudioAttributesCompatParcelizer(bIconCompatParcelizer3), setClientAuthToken.AudioAttributesCompatParcelizer(bIconCompatParcelizer2)}).contains(setClientAuthToken.AudioAttributesCompatParcelizer(setClientAuthToken.IconCompatParcelizer(this.AudioAttributesCompatParcelizer[2])))) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int iIconCompatParcelizer2 = setClientAuthToken.IconCompatParcelizer((byte) setCustomerEmail.read(setCustomerEmail.read(setClientAuthToken.IconCompatParcelizer(this.AudioAttributesCompatParcelizer[3]) & 255) - setCustomerEmail.read(iIconCompatParcelizer))) & 255;
        if (Integer.compareUnsigned(setCustomerEmail.read(iIconCompatParcelizer2), 127) > 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (getOrderDetails.write(this.AudioAttributesCompatParcelizer) <= iIconCompatParcelizer2 + 19) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i = iIconCompatParcelizer2 + 20;
        byte[] bArrWrite = getOrderDetails.write(this.AudioAttributesCompatParcelizer, iIconCompatParcelizer2 + 4, i);
        byte[] bArr2 = this.AudioAttributesCompatParcelizer;
        byte[] bArrWrite2 = getOrderDetails.write(bArr2, i, getOrderDetails.write(bArr2) + 1);
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArrWrite, resetSyncParams.read.write());
            ArrayList arrayList = new ArrayList(16);
            for (int i2 = 0; i2 < 16; i2++) {
                arrayList.add((byte) 0);
            }
            IvParameterSpec ivParameterSpec = new IvParameterSpec(IntermediateLoginResponseBody.write((Collection<Byte>) arrayList));
            try {
                Cipher cipher = Cipher.getInstance(setChannelMap.IconCompatParcelizer.write());
                toMagicModuleMetaRepoModel.write(cipher);
                codecneedsdiscardchannelsworkaround2 = new Ac4Util(cipher);
            } catch (Throwable th) {
                codecneedsdiscardchannelsworkaround2 = new codecNeedsDiscardChannelsWorkaround(th);
            }
            Cipher cipher2 = Cipher.getInstance(BaseAudioProcessor.IconCompatParcelizer.write());
            toMagicModuleMetaRepoModel.write(cipher2);
            Cipher cipher3 = (Cipher) setForHeaderData.read(codecneedsdiscardchannelsworkaround2, cipher2);
            cipher3.init(2, secretKeySpec, ivParameterSpec);
            byte[] bArrDoFinal = cipher3.doFinal(bArrWrite2);
            toMagicModuleMetaRepoModel.write(bArrDoFinal);
            codecneedsdiscardchannelsworkaround = new Ac4Util(bArrDoFinal);
        } catch (Throwable th2) {
            codecneedsdiscardchannelsworkaround = new codecNeedsDiscardChannelsWorkaround(th2);
        }
        byte[] bArr3 = this.AudioAttributesCompatParcelizer;
        if (codecneedsdiscardchannelsworkaround instanceof Ac4Util) {
            return new Ac4Util(new PlaybackStatsListenerPlaybackStatsTracker((byte[]) ((Ac4Util) codecneedsdiscardchannelsworkaround).RemoteActionCompatParcelizer, setClientAuthToken.IconCompatParcelizer(bArr3[2]) == bIconCompatParcelizer3));
        }
        if (codecneedsdiscardchannelsworkaround instanceof codecNeedsDiscardChannelsWorkaround) {
            return codecneedsdiscardchannelsworkaround;
        }
        throw new RenewEligibleCreator();
    }
}
