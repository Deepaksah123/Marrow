package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00018\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\f\u0010\u0015"}, d2 = {"Lo/setColorSchemeColors;", "Lo/DateDeserializersCalendarDeserializer;", "p0", "<init>", "(Lo/DateDeserializersCalendarDeserializer;)V", "Lo/appendReferring;", "Lo/getKey;", "p1", "Lo/tryToResolveUnresolved;", "p2", "p3", "Lo/hasReferringProperties;", "AudioAttributesCompatParcelizer", "(Lo/appendReferring;JLo/tryToResolveUnresolved;J)J", "read", "Lo/DateDeserializersCalendarDeserializer;", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "Lo/getKey;", "Lo/tryToResolveUnresolved;", "write", "Lo/hasReferringProperties;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setColorSchemeColors implements DateDeserializersCalendarDeserializer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public hasReferringProperties IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public getKey AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public tryToResolveUnresolved read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final DateDeserializersCalendarDeserializer RemoteActionCompatParcelizer;
    public getKey write;

    public setColorSchemeColors(DateDeserializersCalendarDeserializer dateDeserializersCalendarDeserializer) {
        this.RemoteActionCompatParcelizer = dateDeserializersCalendarDeserializer;
    }

    @Override // kotlin.DateDeserializersCalendarDeserializer
    public final long AudioAttributesCompatParcelizer(appendReferring p0, long p1, tryToResolveUnresolved p2, long p3) {
        getKey getkey;
        getKey getkey2;
        hasReferringProperties hasreferringproperties = this.IconCompatParcelizer;
        if (hasreferringproperties != null && (getkey = this.AudioAttributesCompatParcelizer) != null && getKey.AudioAttributesCompatParcelizer(getkey.getRemoteActionCompatParcelizer(), p1) && this.read == p2 && (getkey2 = this.write) != null && getKey.AudioAttributesCompatParcelizer(getkey2.getRemoteActionCompatParcelizer(), p3)) {
            return hasreferringproperties.getWrite();
        }
        long jAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(p0, p1, p2, p3);
        this.AudioAttributesCompatParcelizer = getKey.AudioAttributesCompatParcelizer(p1);
        this.read = p2;
        this.write = getKey.AudioAttributesCompatParcelizer(p3);
        this.IconCompatParcelizer = hasReferringProperties.write(jAudioAttributesCompatParcelizer);
        return jAudioAttributesCompatParcelizer;
    }
}
