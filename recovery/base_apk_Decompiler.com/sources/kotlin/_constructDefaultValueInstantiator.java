package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0013H&¢\u0006\u0004\b\u000f\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0012J\u001f\u0010\u0006\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0013H&¢\u0006\u0004\b\u0006\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\nH&¢\u0006\u0004\b\u0006\u0010\u001bJ\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u001cH&¢\u0006\u0004\b\u0006\u0010\u001dJ'\u0010\u001a\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b\u001a\u0010\"J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b#\u0010\tJ'\u0010\u001a\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010 \u001a\u00020\u0002H&¢\u0006\u0004\b\u001a\u0010&J\u0017\u0010'\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b'\u0010(JO\u0010#\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020)2\b\b\u0002\u0010\u0004\u001a\u00020*2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\b\b\u0002\u00101\u001a\u000200H&¢\u0006\u0004\b#\u00102JW\u00105\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020)2\u0006\u0010\u0004\u001a\u0002032\b\b\u0002\u0010 \u001a\u00020\n2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010,2\n\b\u0002\u00101\u001a\u0004\u0018\u00010.2\b\b\u0002\u00104\u001a\u000200H&¢\u0006\u0004\b5\u00106R\u0014\u0010\u0006\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u00107R\u0014\u0010#\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00107R\u0014\u0010\u001a\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u00107R\u0014\u0010\u000f\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u00107R\u0014\u00105\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u00107R\u0014\u0010\u0011\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u00107R\u0014\u0010\u0010\u001a\u00020\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u00108R\u0014\u0010\r\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u00109R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0:8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010;\u0082\u0001\u0001<ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/_constructDefaultValueInstantiator;", "", "", "p0", "p1", "Lo/removeSoftRefsClearedByGc;", "write", "(II)Lo/removeSoftRefsClearedByGc;", "Lo/WritableTypeIdInclusion;", "(I)Lo/WritableTypeIdInclusion;", "", "MediaBrowserCompatCustomActionResultReceiver", "(I)F", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatSearchResultReceiver", "IconCompatParcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "(I)I", "", "(IZ)I", "AudioAttributesImplBaseParcelizer", "(IZ)F", "Lo/_properties;", "MediaBrowserCompatMediaItem", "(I)Lo/_properties;", "RemoteActionCompatParcelizer", "(F)I", "Lo/getReferencedType;", "(J)I", "Lo/_handleTypedObjectId;", "Lo/_resolveInnerClassValuedProperty;", "p2", "Lo/findProperty;", "(Lo/WritableTypeIdInclusion;ILo/_resolveInnerClassValuedProperty;)J", "AudioAttributesCompatParcelizer", "", "", "(J[FI)V", "MediaDescriptionCompat", "(I)J", "Lo/JsonParserDelegate;", "Lo/switchToNext;", "Lo/nopInstance;", "Lo/renameAll;", "p3", "Lo/findViews;", "p4", "Lo/createInstance;", "p5", "(Lo/JsonParserDelegate;JLo/nopInstance;Lo/renameAll;Lo/findViews;I)V", "Lo/Instantiatable;", "p6", "read", "(Lo/JsonParserDelegate;Lo/Instantiatable;FLo/nopInstance;Lo/renameAll;Lo/findViews;I)V", "()F", "()Z", "()I", "", "()Ljava/util/List;", "Lo/hasKeySerializers;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface _constructDefaultValueInstantiator {
    WritableTypeIdInclusion AudioAttributesCompatParcelizer(int p0);

    void AudioAttributesCompatParcelizer(JsonParserDelegate p0, long p1, nopInstance p2, renameAll p3, findViews p4, int p5);

    boolean AudioAttributesCompatParcelizer();

    int AudioAttributesImplApi21Parcelizer(int p0);

    float AudioAttributesImplApi26Parcelizer(int p0);

    List<WritableTypeIdInclusion> AudioAttributesImplApi26Parcelizer();

    float AudioAttributesImplBaseParcelizer();

    int AudioAttributesImplBaseParcelizer(int p0);

    float IconCompatParcelizer(int p0);

    int IconCompatParcelizer();

    int IconCompatParcelizer(int p0, boolean p1);

    float MediaBrowserCompatCustomActionResultReceiver();

    float MediaBrowserCompatCustomActionResultReceiver(int p0);

    float MediaBrowserCompatItemReceiver();

    float MediaBrowserCompatItemReceiver(int p0);

    _properties MediaBrowserCompatMediaItem(int p0);

    float MediaBrowserCompatSearchResultReceiver(int p0);

    long MediaDescriptionCompat(int p0);

    float RemoteActionCompatParcelizer();

    long RemoteActionCompatParcelizer(WritableTypeIdInclusion p0, int p1, _resolveInnerClassValuedProperty p2);

    _properties RemoteActionCompatParcelizer(int p0);

    void RemoteActionCompatParcelizer(long p0, float[] p1, int p2);

    float read();

    void read(JsonParserDelegate p0, Instantiatable p1, float p2, nopInstance p3, renameAll p4, findViews p5, int p6);

    float write();

    float write(int p0, boolean p1);

    int write(float p0);

    int write(long p0);

    WritableTypeIdInclusion write(int p0);

    removeSoftRefsClearedByGc write(int p0, int p1);

    static /* synthetic */ void AudioAttributesCompatParcelizer$default(_constructDefaultValueInstantiator _constructdefaultvalueinstantiator, JsonParserDelegate jsonParserDelegate, long j, nopInstance nopinstance, renameAll renameall, findViews findviews, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
        _constructdefaultvalueinstantiator.AudioAttributesCompatParcelizer(jsonParserDelegate, (i2 & 2) != 0 ? switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer() : j, (i2 & 4) != 0 ? null : nopinstance, (i2 & 8) != 0 ? null : renameall, (i2 & 16) == 0 ? findviews : null, (i2 & 32) != 0 ? findSetterInfo.INSTANCE.write() : i);
    }

    static /* synthetic */ void read$default(_constructDefaultValueInstantiator _constructdefaultvalueinstantiator, JsonParserDelegate jsonParserDelegate, Instantiatable instantiatable, float f, nopInstance nopinstance, renameAll renameall, findViews findviews, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
        }
        _constructdefaultvalueinstantiator.read(jsonParserDelegate, instantiatable, (i2 & 4) != 0 ? Float.NaN : f, (i2 & 8) != 0 ? null : nopinstance, (i2 & 16) != 0 ? null : renameall, (i2 & 32) != 0 ? null : findviews, (i2 & 64) != 0 ? findSetterInfo.INSTANCE.write() : i);
    }
}
