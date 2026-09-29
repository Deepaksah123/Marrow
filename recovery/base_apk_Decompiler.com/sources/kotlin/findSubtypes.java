package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/findSerializationTyping;", "Lo/findTypeName;", "AudioAttributesCompatParcelizer", "(Lo/findSerializationTyping;)Lo/findTypeName;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class findSubtypes {

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0015\u0010\u0018R\u0014\u0010\f\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u001a"}, d2 = {"Lo/findSubtypes$write;", "Lo/findTypeName;", "", "p0", "p1", "p2", "p3", "", "write", "(FFFF)V", "Lo/ReadConstrainedTextBuffer;", "p4", "AudioAttributesCompatParcelizer", "(FFFFI)V", "Lo/removeSoftRefsClearedByGc;", "(Lo/removeSoftRefsClearedByGc;I)V", "RemoteActionCompatParcelizer", "(FF)V", "Lo/getReferencedType;", "IconCompatParcelizer", "(FJ)V", "read", "(FFJ)V", "Lo/resetWithShared;", "([F)V", "Lo/calloc;", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write implements findTypeName {
        final /* synthetic */ findSerializationTyping AudioAttributesCompatParcelizer;

        write(findSerializationTyping findserializationtyping) {
            this.AudioAttributesCompatParcelizer = findserializationtyping;
        }

        @Override // kotlin.findTypeName
        public final long RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        }

        @Override // kotlin.findTypeName
        public final void write(float p0, float p1, float p2, float p3) {
            JsonParserDelegate jsonParserDelegateIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
            findSerializationTyping findserializationtyping = this.AudioAttributesCompatParcelizer;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (RemoteActionCompatParcelizer() >> 32));
            long j = -1;
            long jWrite = calloc.write((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) RemoteActionCompatParcelizer()) - (p3 + p1))) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (Float.floatToRawIntBits(fIntBitsToFloat - (p2 + p0)) << 32));
            if (Float.intBitsToFloat((int) (jWrite >> 32)) < BitmapDescriptorFactory.HUE_RED || Float.intBitsToFloat((int) jWrite) < BitmapDescriptorFactory.HUE_RED) {
                emptyAndGetCurrentSegment.AudioAttributesCompatParcelizer("Width and height must be greater than or equal to zero");
            }
            findserializationtyping.IconCompatParcelizer(jWrite);
            jsonParserDelegateIconCompatParcelizer.RemoteActionCompatParcelizer(p0, p1);
        }

        @Override // kotlin.findTypeName
        public final void AudioAttributesCompatParcelizer(float p0, float p1, float p2, float p3, int p4) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer().IconCompatParcelizer(p0, p1, p2, p3, p4);
        }

        @Override // kotlin.findTypeName
        public final void write(removeSoftRefsClearedByGc p0, int p1) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer().AudioAttributesCompatParcelizer(p0, p1);
        }

        @Override // kotlin.findTypeName
        public final void RemoteActionCompatParcelizer(float p0, float p1) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer().RemoteActionCompatParcelizer(p0, p1);
        }

        @Override // kotlin.findTypeName
        public final void IconCompatParcelizer(float p0, long p1) {
            JsonParserDelegate jsonParserDelegateIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
            int i = (int) (p1 >> 32);
            int i2 = (int) p1;
            jsonParserDelegateIconCompatParcelizer.RemoteActionCompatParcelizer(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
            jsonParserDelegateIconCompatParcelizer.AudioAttributesCompatParcelizer(p0);
            jsonParserDelegateIconCompatParcelizer.RemoteActionCompatParcelizer(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        }

        @Override // kotlin.findTypeName
        public final void read(float p0, float p1, long p2) {
            JsonParserDelegate jsonParserDelegateIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
            int i = (int) (p2 >> 32);
            int i2 = (int) p2;
            jsonParserDelegateIconCompatParcelizer.RemoteActionCompatParcelizer(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
            jsonParserDelegateIconCompatParcelizer.AudioAttributesCompatParcelizer(p0, p1);
            jsonParserDelegateIconCompatParcelizer.RemoteActionCompatParcelizer(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        }

        @Override // kotlin.findTypeName
        public final void read(float[] p0) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer().read(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final findTypeName AudioAttributesCompatParcelizer(findSerializationTyping findserializationtyping) {
        return new write(findserializationtyping);
    }
}
