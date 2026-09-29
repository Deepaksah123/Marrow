package kotlin;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\r\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u001bJ\u001f\u0010\r\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u001dJ\u0017\u0010\r\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010!J\u0017\u0010$\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010!J\u0017\u0010%\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010!J\u0017\u0010&\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010!J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020)H\u0016¢\u0006\u0004\b%\u0010*J\u0017\u0010+\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010(J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020)H\u0016¢\u0006\u0004\b\r\u0010,J\u0017\u0010.\u001a\u00020-2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u0010\u0015\u001a\u00020-2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010/J\u001b\u0010\u0015\u001a\n\u0012\u0004\u0012\u000202\u0018\u000101*\u000200H\u0002¢\u0006\u0004\b\u0015\u00103J\u001f\u0010\u0017\u001a\u00020)*\u0002042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u000305H\u0002¢\u0006\u0004\b\u0017\u00106JE\u0010\u0017\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u0002072\u0006\u0010\u0005\u001a\u0002082\b\u0010\u0007\u001a\u0004\u0018\u0001092\b\u0010\t\u001a\u0004\u0018\u00010:2\b\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b\u0017\u0010?JM\u0010$\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u0002072\u0006\u0010\u0005\u001a\u00020@2\u0006\u0010\u0007\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u0001092\b\u0010<\u001a\u0004\u0018\u00010:2\b\u0010>\u001a\u0004\u0018\u00010;2\u0006\u0010A\u001a\u00020=H\u0016¢\u0006\u0004\b$\u0010BJ\u0017\u0010\u0017\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u000207H\u0002¢\u0006\u0004\b\u0017\u0010CJ[\u0010$\u001a\u0002002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010D2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\u00042\b\b\u0002\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\b$\u0010HR\u0011\u0010\r\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b'\u0010IR\u0011\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b%\u0010JR\u0011\u0010%\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\r\u0010JR\u0011\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010KR\u0014\u0010$\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010LR\u0014\u0010'\u001a\u00020F8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010MR\u0014\u0010&\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010NR\u0014\u0010\"\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010NR\u0014\u0010+\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010NR\u0014\u0010 \u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010NR\u0014\u0010#\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010NR\u0014\u0010.\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010NR\u0014\u0010\u001e\u001a\u00020)8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010OR\u0014\u0010Q\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010PR\"\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110R8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\"\u0010S\u001a\u0004\b\"\u0010TR\u0014\u0010X\u001a\u00020V8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010W"}, d2 = {"Lo/hasKeySerializers;", "Lo/_constructDefaultValueInstantiator;", "Lo/canCreateUsingArrayDelegate;", "p0", "", "p1", "Lo/paramName;", "p2", "Lo/PropertyValueAny;", "p3", "<init>", "(Lo/canCreateUsingArrayDelegate;IIJLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "write", "(F)I", "Lo/getReferencedType;", "(J)I", "Lo/WritableTypeIdInclusion;", "Lo/_handleTypedObjectId;", "Lo/_resolveInnerClassValuedProperty;", "Lo/findProperty;", "RemoteActionCompatParcelizer", "(Lo/WritableTypeIdInclusion;ILo/_resolveInnerClassValuedProperty;)J", "AudioAttributesCompatParcelizer", "(I)Lo/WritableTypeIdInclusion;", "", "", "(J[FI)V", "Lo/removeSoftRefsClearedByGc;", "(II)Lo/removeSoftRefsClearedByGc;", "MediaDescriptionCompat", "(I)J", "MediaBrowserCompatCustomActionResultReceiver", "(I)F", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatSearchResultReceiver", "read", "IconCompatParcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "(I)I", "", "(IZ)I", "AudioAttributesImplBaseParcelizer", "(IZ)F", "Lo/_properties;", "MediaBrowserCompatMediaItem", "(I)Lo/_properties;", "Lo/addInjectables;", "", "Lo/BeanPropertyMap;", "(Lo/addInjectables;)[Lo/BeanPropertyMap;", "Landroid/text/Spanned;", "Ljava/lang/Class;", "(Landroid/text/Spanned;Ljava/lang/Class;)Z", "Lo/JsonParserDelegate;", "Lo/switchToNext;", "Lo/nopInstance;", "Lo/renameAll;", "Lo/findViews;", "p4", "Lo/createInstance;", "p5", "(Lo/JsonParserDelegate;JLo/nopInstance;Lo/renameAll;Lo/findViews;I)V", "Lo/Instantiatable;", "p6", "(Lo/JsonParserDelegate;Lo/Instantiatable;FLo/nopInstance;Lo/renameAll;Lo/findViews;I)V", "(Lo/JsonParserDelegate;)V", "Landroid/text/TextUtils$TruncateAt;", "p7", "", "p8", "(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)Lo/addInjectables;", "Lo/canCreateUsingArrayDelegate;", "I", "J", "Lo/addInjectables;", "Ljava/lang/CharSequence;", "()F", "()Z", "()I", "MediaMetadataCompat", "", "Ljava/util/List;", "()Ljava/util/List;", "RatingCompat", "Lo/canInstantiate;", "()Lo/canInstantiate;", "onCustomAction"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class hasKeySerializers implements _constructDefaultValueInstantiator {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final canCreateUsingArrayDelegate write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final List<WritableTypeIdInclusion> RatingCompat;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final CharSequence AudioAttributesImplApi21Parcelizer;
    private final addInjectables read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[_properties.values().length];
            try {
                iArr[_properties.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[_properties.IconCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            read = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private hasKeySerializers(kotlin.canCreateUsingArrayDelegate r29, int r30, int r31, long r32) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.hasKeySerializers.<init>(o.canCreateUsingArrayDelegate, int, int, long):void");
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final float MediaBrowserCompatItemReceiver() {
        return PropertyValueAny.AudioAttributesImplBaseParcelizer(this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final float read() {
        return this.read.IconCompatParcelizer();
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final float AudioAttributesImplBaseParcelizer() {
        return this.write.write();
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final float MediaBrowserCompatCustomActionResultReceiver() {
        return this.write.RemoteActionCompatParcelizer();
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final float RemoteActionCompatParcelizer() {
        return read(0);
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final float write() {
        return read(IconCompatParcelizer() - 1);
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final boolean AudioAttributesCompatParcelizer() {
        return this.read.getAudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final int IconCompatParcelizer() {
        return this.read.getAudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final List<WritableTypeIdInclusion> AudioAttributesImplApi26Parcelizer() {
        return this.RatingCompat;
    }

    public final canInstantiate AudioAttributesImplApi21Parcelizer() {
        return this.write.getAudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final int write(float p0) {
        return this.read.MediaBrowserCompatItemReceiver((int) p0);
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final int write(long p0) {
        long j = -1;
        return this.read.RemoteActionCompatParcelizer(this.read.MediaBrowserCompatItemReceiver((int) Float.intBitsToFloat((int) (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & p0))), Float.intBitsToFloat((int) (p0 >> 32)));
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final long RemoteActionCompatParcelizer(WritableTypeIdInclusion p0, int p1, final _resolveInnerClassValuedProperty p2) {
        int[] iArrAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(VersionUtil.IconCompatParcelizer(p0), C0198serializers.MediaBrowserCompatMediaItem(p1), new MagicModuleSubmissionRequestBody() { // from class: o.serializerModifiers
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(hasKeySerializers.RemoteActionCompatParcelizer(p2, (RectF) obj, (RectF) obj2));
            }
        });
        if (iArrAudioAttributesCompatParcelizer == null) {
            return findProperty.INSTANCE.AudioAttributesCompatParcelizer();
        }
        return getValueInstantiator.write(iArrAudioAttributesCompatParcelizer[0], iArrAudioAttributesCompatParcelizer[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RemoteActionCompatParcelizer(_resolveInnerClassValuedProperty _resolveinnerclassvaluedproperty, RectF rectF, RectF rectF2) {
        return _resolveinnerclassvaluedproperty.IconCompatParcelizer(VersionUtil.AudioAttributesCompatParcelizer(rectF), VersionUtil.AudioAttributesCompatParcelizer(rectF2));
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final WritableTypeIdInclusion AudioAttributesCompatParcelizer(int p0) {
        if (p0 < 0 || p0 >= this.AudioAttributesImplApi21Parcelizer.length()) {
            StringBuilder sb = new StringBuilder("offset(");
            sb.append(p0);
            sb.append(") is out of bounds [0,");
            sb.append(this.AudioAttributesImplApi21Parcelizer.length());
            sb.append(')');
            withStackTrace.read(sb.toString());
        }
        RectF rectFWrite = this.read.write(p0);
        return new WritableTypeIdInclusion(rectFWrite.left, rectFWrite.top, rectFWrite.right, rectFWrite.bottom);
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final void RemoteActionCompatParcelizer(long p0, float[] p1, int p2) {
        this.read.write(findProperty.MediaBrowserCompatCustomActionResultReceiver(p0), findProperty.AudioAttributesImplApi26Parcelizer(p0), p1, p2);
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final removeSoftRefsClearedByGc write(int p0, int p1) {
        if (p0 < 0 || p0 > p1 || p1 > this.AudioAttributesImplApi21Parcelizer.length()) {
            StringBuilder sb = new StringBuilder("start(");
            sb.append(p0);
            sb.append(") or end(");
            sb.append(p1);
            sb.append(") is out of range [0..");
            sb.append(this.AudioAttributesImplApi21Parcelizer.length());
            sb.append("], or start > end!");
            withStackTrace.read(sb.toString());
        }
        Path path = new Path();
        this.read.RemoteActionCompatParcelizer(p0, p1, path);
        return writeIndentation.RemoteActionCompatParcelizer(path);
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final WritableTypeIdInclusion write(int p0) {
        if (p0 < 0 || p0 > this.AudioAttributesImplApi21Parcelizer.length()) {
            StringBuilder sb = new StringBuilder("offset(");
            sb.append(p0);
            sb.append(") is out of bounds [0,");
            sb.append(this.AudioAttributesImplApi21Parcelizer.length());
            sb.append(']');
            withStackTrace.read(sb.toString());
        }
        float f = addInjectables.read$default(this.read, p0, false, 2, null);
        int iMediaBrowserCompatCustomActionResultReceiver = this.read.MediaBrowserCompatCustomActionResultReceiver(p0);
        return new WritableTypeIdInclusion(f, this.read.MediaMetadataCompat(iMediaBrowserCompatCustomActionResultReceiver), f, this.read.read(iMediaBrowserCompatCustomActionResultReceiver));
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final long MediaDescriptionCompat(int p0) {
        constructSetterlessProperty constructsetterlesspropertyAudioAttributesImplBaseParcelizer = this.read.AudioAttributesImplBaseParcelizer();
        return getValueInstantiator.write(buildBeanDeserializer.IconCompatParcelizer(constructsetterlesspropertyAudioAttributesImplBaseParcelizer, p0), buildBeanDeserializer.RemoteActionCompatParcelizer(constructsetterlesspropertyAudioAttributesImplBaseParcelizer, p0));
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final float MediaBrowserCompatCustomActionResultReceiver(int p0) {
        return this.read.AudioAttributesImplApi26Parcelizer(p0);
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final float AudioAttributesImplApi26Parcelizer(int p0) {
        return this.read.MediaBrowserCompatSearchResultReceiver(p0);
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final float MediaBrowserCompatSearchResultReceiver(int p0) {
        return this.read.MediaMetadataCompat(p0);
    }

    public final float read(int p0) {
        return this.read.IconCompatParcelizer(p0);
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final float IconCompatParcelizer(int p0) {
        return this.read.read(p0);
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final float MediaBrowserCompatItemReceiver(int p0) {
        return this.read.AudioAttributesImplApi21Parcelizer(p0);
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final int AudioAttributesImplApi21Parcelizer(int p0) {
        return this.read.RatingCompat(p0);
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final int IconCompatParcelizer(int p0, boolean p1) {
        if (p1) {
            return this.read.MediaDescriptionCompat(p0);
        }
        return this.read.AudioAttributesImplBaseParcelizer(p0);
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final int AudioAttributesImplBaseParcelizer(int p0) {
        return this.read.MediaBrowserCompatCustomActionResultReceiver(p0);
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final float write(int p0, boolean p1) {
        if (p1) {
            return addInjectables.read$default(this.read, p0, false, 2, null);
        }
        return addInjectables.AudioAttributesCompatParcelizer$default(this.read, p0, false, 2, null);
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final _properties MediaBrowserCompatMediaItem(int p0) {
        return this.read.MediaBrowserCompatMediaItem(this.read.MediaBrowserCompatCustomActionResultReceiver(p0)) == 1 ? _properties.RemoteActionCompatParcelizer : _properties.IconCompatParcelizer;
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final _properties RemoteActionCompatParcelizer(int p0) {
        return this.read.handleMediaPlayPauseIfPendingOnHandler(p0) ? _properties.IconCompatParcelizer : _properties.RemoteActionCompatParcelizer;
    }

    private final BeanPropertyMap[] RemoteActionCompatParcelizer(addInjectables addinjectables) {
        if (!(addinjectables.MediaBrowserCompatItemReceiver() instanceof Spanned)) {
            return null;
        }
        CharSequence charSequenceMediaBrowserCompatItemReceiver = addinjectables.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.read(charSequenceMediaBrowserCompatItemReceiver, "");
        if (!AudioAttributesCompatParcelizer((Spanned) charSequenceMediaBrowserCompatItemReceiver, BeanPropertyMap.class)) {
            return null;
        }
        CharSequence charSequenceMediaBrowserCompatItemReceiver2 = addinjectables.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.read(charSequenceMediaBrowserCompatItemReceiver2, "");
        return (BeanPropertyMap[]) ((Spanned) charSequenceMediaBrowserCompatItemReceiver2).getSpans(0, addinjectables.MediaBrowserCompatItemReceiver().length(), BeanPropertyMap.class);
    }

    private final boolean AudioAttributesCompatParcelizer(Spanned spanned, Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final void AudioAttributesCompatParcelizer(JsonParserDelegate p0, long p1, nopInstance p2, renameAll p3, findViews p4, int p5) {
        int iconCompatParcelizer = AudioAttributesImplApi21Parcelizer().getIconCompatParcelizer();
        canInstantiate caninstantiateAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        caninstantiateAudioAttributesImplApi21Parcelizer.IconCompatParcelizer(p1);
        caninstantiateAudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(p2);
        caninstantiateAudioAttributesImplApi21Parcelizer.IconCompatParcelizer(p3);
        caninstantiateAudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(p4);
        caninstantiateAudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(p5);
        AudioAttributesCompatParcelizer(p0);
        AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(iconCompatParcelizer);
    }

    @Override // kotlin._constructDefaultValueInstantiator
    public final void read(JsonParserDelegate p0, Instantiatable p1, float p2, nopInstance p3, renameAll p4, findViews p5, int p6) {
        int iconCompatParcelizer = AudioAttributesImplApi21Parcelizer().getIconCompatParcelizer();
        canInstantiate caninstantiateAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        long j = -1;
        caninstantiateAudioAttributesImplApi21Parcelizer.read(p1, calloc.write((((long) Float.floatToRawIntBits(read())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits(MediaBrowserCompatItemReceiver())) << 32)), p2);
        caninstantiateAudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(p3);
        caninstantiateAudioAttributesImplApi21Parcelizer.IconCompatParcelizer(p4);
        caninstantiateAudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(p5);
        caninstantiateAudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(p6);
        AudioAttributesCompatParcelizer(p0);
        AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(iconCompatParcelizer);
    }

    private final void AudioAttributesCompatParcelizer(JsonParserDelegate p0) {
        Canvas canvasRemoteActionCompatParcelizer = balloc.RemoteActionCompatParcelizer(p0);
        if (AudioAttributesCompatParcelizer()) {
            canvasRemoteActionCompatParcelizer.save();
            canvasRemoteActionCompatParcelizer.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, MediaBrowserCompatItemReceiver(), read());
        }
        this.read.IconCompatParcelizer(canvasRemoteActionCompatParcelizer);
        if (AudioAttributesCompatParcelizer()) {
            canvasRemoteActionCompatParcelizer.restore();
        }
    }

    static /* synthetic */ addInjectables read$default(hasKeySerializers haskeyserializers, int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence, int i8, Object obj) {
        return haskeyserializers.read(i, i2, truncateAt, i3, i4, i5, i6, i7, (i8 & 256) != 0 ? haskeyserializers.AudioAttributesImplApi21Parcelizer : charSequence);
    }

    private final addInjectables read(int p0, int p1, TextUtils.TruncateAt p2, int p3, int p4, int p5, int p6, int p7, CharSequence p8) {
        float fMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        canInstantiate caninstantiateAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        return new addInjectables(p8, fMediaBrowserCompatItemReceiver, caninstantiateAudioAttributesImplApi21Parcelizer, p0, p2, this.write.getMediaDescriptionCompat(), 1.0f, BitmapDescriptorFactory.HUE_RED, canCreateUsingDelegate.RemoteActionCompatParcelizer(this.write.getAudioAttributesCompatParcelizer()), true, p3, p5, p6, p7, p4, p1, null, null, this.write.getMediaBrowserCompatCustomActionResultReceiver(), 196736, null);
    }

    public /* synthetic */ hasKeySerializers(canCreateUsingArrayDelegate cancreateusingarraydelegate, int i, int i2, long j, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(cancreateusingarraydelegate, i, i2, j);
    }
}
