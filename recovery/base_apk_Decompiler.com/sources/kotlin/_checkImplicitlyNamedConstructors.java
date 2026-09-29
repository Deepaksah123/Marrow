package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJM\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\f2\b\b\u0002\u0010\u0005\u001a\u00020\r2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016JU\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00172\b\b\u0002\u0010\u0007\u001a\u00020\u00182\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0018¢\u0006\u0004\b\u0015\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J%\u0010&\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010\u001c\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010(J%\u0010*\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+J\u001d\u0010\u0015\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020,¢\u0006\u0004\b\u0015\u0010-J\u0015\u0010/\u001a\u00020.2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b/\u00100J\u0015\u0010*\u001a\u00020.2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b*\u00100J\u0015\u00101\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b1\u00102J\u0015\u0010&\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b&\u0010(J\u0015\u0010 \u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b \u00103J\u0015\u00104\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b6\u00105J\u0015\u00107\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b7\u00105J\u0015\u0010\u0015\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u00105J\u0015\u00108\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b8\u00105J\u0015\u00109\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b9\u00103J\u001f\u0010&\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020,¢\u0006\u0004\b&\u0010:J\u0017\u0010;\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b=\u0010<J\u0017\u0010>\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b>\u0010<R\u0017\u0010\u001c\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010?\u001a\u0004\b\u0015\u0010@R\u001a\u0010 \u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010A\u001a\u0004\b7\u0010BR\u0014\u0010*\u001a\u00020C8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010DR\u001a\u0010\u0015\u001a\u00020,8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010E\u001a\u0004\b\u001c\u0010FR\u001a\u0010&\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010G\u001a\u0004\b6\u0010HR\u001a\u00104\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010G\u001a\u0004\b*\u0010HR\u0011\u00108\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b&\u0010HR\u0011\u00107\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b \u0010HR\u001a\u00106\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010A\u001a\u0004\b4\u0010BR\"\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0I8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010J\u001a\u0004\b8\u0010KR \u0010>\u001a\b\u0012\u0004\u0012\u00020L0I8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b8\u0010J\u001a\u0004\b9\u0010K"}, d2 = {"Lo/_checkImplicitlyNamedConstructors;", "", "Lo/_findParamName;", "p0", "Lo/PropertyValueAny;", "p1", "", "p2", "Lo/paramName;", "p3", "<init>", "(Lo/_findParamName;JIILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/JsonParserDelegate;", "Lo/switchToNext;", "Lo/nopInstance;", "Lo/renameAll;", "Lo/findViews;", "p4", "Lo/createInstance;", "p5", "", "RemoteActionCompatParcelizer", "(Lo/JsonParserDelegate;JLo/nopInstance;Lo/renameAll;Lo/findViews;I)V", "Lo/Instantiatable;", "", "p6", "(Lo/JsonParserDelegate;Lo/Instantiatable;FLo/nopInstance;Lo/renameAll;Lo/findViews;I)V", "Lo/removeSoftRefsClearedByGc;", "read", "(II)Lo/removeSoftRefsClearedByGc;", "(F)I", "Lo/getReferencedType;", "write", "(J)I", "Lo/WritableTypeIdInclusion;", "Lo/_handleTypedObjectId;", "Lo/_resolveInnerClassValuedProperty;", "Lo/findProperty;", "IconCompatParcelizer", "(Lo/WritableTypeIdInclusion;ILo/_resolveInnerClassValuedProperty;)J", "(I)Lo/WritableTypeIdInclusion;", "", "AudioAttributesCompatParcelizer", "(J[FI)[F", "", "(IZ)F", "Lo/_properties;", "MediaBrowserCompatMediaItem", "(I)Lo/_properties;", "MediaMetadataCompat", "(I)J", "(I)I", "AudioAttributesImplApi21Parcelizer", "(I)F", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "(IZ)I", "MediaBrowserCompatSearchResultReceiver", "(I)V", "RatingCompat", "MediaDescriptionCompat", "Lo/_findParamName;", "()Lo/_findParamName;", "I", "()I", "Lo/AbstractDeserializer;", "()Lo/AbstractDeserializer;", "Z", "()Z", "F", "()F", "", "Ljava/util/List;", "()Ljava/util/List;", "Lo/_findCustomArrayDeserializer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _checkImplicitlyNamedConstructors {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final float AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final List<WritableTypeIdInclusion> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final List<_findCustomArrayDeserializer> MediaDescriptionCompat;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final float IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final _findParamName read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;
    private final int write;

    private _checkImplicitlyNamedConstructors(_findParamName _findparamname, long j, int i, int i2) {
        boolean z;
        int iAudioAttributesImplApi21Parcelizer;
        this.read = _findparamname;
        this.write = i;
        if (PropertyValueAny.MediaBrowserCompatItemReceiver(j) != 0 || PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j) != 0) {
            withStackTrace.read("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List<_findCreatorsFromProperties> list = _findparamname.read();
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        int i5 = 0;
        while (i5 < size) {
            _findCreatorsFromProperties _findcreatorsfromproperties = list.get(i5);
            _findCustomBeanDeserializer iconCompatParcelizer = _findcreatorsfromproperties.getIconCompatParcelizer();
            int iAudioAttributesImplBaseParcelizer = PropertyValueAny.AudioAttributesImplBaseParcelizer(j);
            if (PropertyValueAny.AudioAttributesCompatParcelizer(j)) {
                iAudioAttributesImplApi21Parcelizer = getQues.write(PropertyValueAny.AudioAttributesImplApi21Parcelizer(j) - _findCustomMapLikeDeserializer.RemoteActionCompatParcelizer(f), i3);
            } else {
                iAudioAttributesImplApi21Parcelizer = PropertyValueAny.AudioAttributesImplApi21Parcelizer(j);
            }
            _constructDefaultValueInstantiator _constructdefaultvalueinstantiatorIconCompatParcelizer = _findCustomMapLikeDeserializer.IconCompatParcelizer(iconCompatParcelizer, PropertyValueBuffer.read$default(0, iAudioAttributesImplBaseParcelizer, 0, iAudioAttributesImplApi21Parcelizer, 5, null), this.write - i4, i2);
            float f2 = f + _constructdefaultvalueinstantiatorIconCompatParcelizer.read();
            int iIconCompatParcelizer = i4 + _constructdefaultvalueinstantiatorIconCompatParcelizer.IconCompatParcelizer();
            List<_findCreatorsFromProperties> list2 = list;
            arrayList.add(new _findCustomArrayDeserializer(_constructdefaultvalueinstantiatorIconCompatParcelizer, _findcreatorsfromproperties.getWrite(), _findcreatorsfromproperties.getAudioAttributesCompatParcelizer(), i4, iIconCompatParcelizer, f, f2));
            if (_constructdefaultvalueinstantiatorIconCompatParcelizer.AudioAttributesCompatParcelizer() || (iIconCompatParcelizer == this.write && i5 != IntermediateLoginResponseBody.write((List) this.read.read()))) {
                z = true;
                i4 = iIconCompatParcelizer;
                f = f2;
                break;
            } else {
                i5++;
                i4 = iIconCompatParcelizer;
                f = f2;
                i3 = 0;
                list = list2;
            }
        }
        z = false;
        this.AudioAttributesImplApi21Parcelizer = f;
        this.AudioAttributesImplBaseParcelizer = i4;
        this.RemoteActionCompatParcelizer = z;
        this.MediaDescriptionCompat = arrayList;
        this.IconCompatParcelizer = PropertyValueAny.AudioAttributesImplBaseParcelizer(j);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            _findCustomArrayDeserializer _findcustomarraydeserializer = (_findCustomArrayDeserializer) arrayList.get(i6);
            List<WritableTypeIdInclusion> listAudioAttributesImplApi26Parcelizer = _findcustomarraydeserializer.getAudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer();
            ArrayList arrayList3 = new ArrayList(listAudioAttributesImplApi26Parcelizer.size());
            int size3 = listAudioAttributesImplApi26Parcelizer.size();
            for (int i7 = 0; i7 < size3; i7++) {
                ArrayList arrayList4 = arrayList3;
                WritableTypeIdInclusion writableTypeIdInclusion = listAudioAttributesImplApi26Parcelizer.get(i7);
                arrayList4.add(writableTypeIdInclusion != null ? _findcustomarraydeserializer.AudioAttributesCompatParcelizer(writableTypeIdInclusion) : null);
            }
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList2, (Iterable) arrayList3);
        }
        ArrayList arrayListAudioAttributesCompatParcelizer = arrayList2;
        if (arrayListAudioAttributesCompatParcelizer.size() < this.read.AudioAttributesImplApi26Parcelizer().size()) {
            ArrayList arrayList5 = arrayListAudioAttributesCompatParcelizer;
            int size4 = this.read.AudioAttributesImplApi26Parcelizer().size() - arrayListAudioAttributesCompatParcelizer.size();
            ArrayList arrayList6 = new ArrayList(size4);
            for (int i8 = 0; i8 < size4; i8++) {
                arrayList6.add(null);
            }
            arrayListAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) arrayList5, (Iterable) arrayList6);
        }
        this.MediaBrowserCompatItemReceiver = arrayListAudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final _findParamName getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    private final AbstractDeserializer RatingCompat() {
        return this.read.getRead();
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final float getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final float getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final float IconCompatParcelizer() {
        return this.MediaDescriptionCompat.isEmpty() ? BitmapDescriptorFactory.HUE_RED : this.MediaDescriptionCompat.get(0).getAudioAttributesCompatParcelizer().RemoteActionCompatParcelizer();
    }

    public final float write() {
        if (this.MediaDescriptionCompat.isEmpty()) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        _findCustomArrayDeserializer _findcustomarraydeserializer = (_findCustomArrayDeserializer) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) this.MediaDescriptionCompat);
        return _findcustomarraydeserializer.write(_findcustomarraydeserializer.getAudioAttributesCompatParcelizer().write());
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final int getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final List<WritableTypeIdInclusion> AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final List<_findCustomArrayDeserializer> MediaBrowserCompatItemReceiver() {
        return this.MediaDescriptionCompat;
    }

    public final void RemoteActionCompatParcelizer(JsonParserDelegate p0, long p1, nopInstance p2, renameAll p3, findViews p4, int p5) {
        p0.IconCompatParcelizer();
        List<_findCustomArrayDeserializer> list = this.MediaDescriptionCompat;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            _findCustomArrayDeserializer _findcustomarraydeserializer = list.get(i);
            _findcustomarraydeserializer.getAudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(p0, p1, p2, p3, p4, p5);
            p0.RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, _findcustomarraydeserializer.getAudioAttributesCompatParcelizer().read());
        }
        p0.AudioAttributesCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer(JsonParserDelegate p0, Instantiatable p1, float p2, nopInstance p3, renameAll p4, findViews p5, int p6) {
        canCreateUsingDefault.AudioAttributesCompatParcelizer(this, p0, p1, p2, p3, p4, p5, p6);
    }

    public final removeSoftRefsClearedByGc read(final int p0, final int p1) {
        if (p0 < 0 || p0 > p1 || p1 > RatingCompat().getIconCompatParcelizer().length()) {
            StringBuilder sb = new StringBuilder("Start(");
            sb.append(p0);
            sb.append(") or End(");
            sb.append(p1);
            sb.append(") is out of range [0..");
            sb.append(RatingCompat().getIconCompatParcelizer().length());
            sb.append("), or start > end!");
            withStackTrace.read(sb.toString());
        }
        if (p0 == p1) {
            return writeIndentation.write();
        }
        final removeSoftRefsClearedByGc removesoftrefsclearedbygcWrite = writeIndentation.write();
        _addExplicitConstructorCreators.AudioAttributesCompatParcelizer(this.MediaDescriptionCompat, getValueInstantiator.write(p0, p1), new getAnswerMap() { // from class: o._createEnumKeyDeserializer
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return _checkImplicitlyNamedConstructors.IconCompatParcelizer(removesoftrefsclearedbygcWrite, p0, p1, (_findCustomArrayDeserializer) obj);
            }
        });
        return removesoftrefsclearedbygcWrite;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(removeSoftRefsClearedByGc removesoftrefsclearedbygc, int i, int i2, _findCustomArrayDeserializer _findcustomarraydeserializer) {
        removeSoftRefsClearedByGc.write$default(removesoftrefsclearedbygc, _findcustomarraydeserializer.write(_findcustomarraydeserializer.getAudioAttributesCompatParcelizer().write(_findcustomarraydeserializer.write(i), _findcustomarraydeserializer.write(i2))), 0L, 2, (Object) null);
        return getShowPopup.INSTANCE;
    }

    public final int RemoteActionCompatParcelizer(float p0) {
        _findCustomArrayDeserializer _findcustomarraydeserializer = this.MediaDescriptionCompat.get(_addExplicitConstructorCreators.IconCompatParcelizer(this.MediaDescriptionCompat, p0));
        if (_findcustomarraydeserializer.IconCompatParcelizer() == 0) {
            return _findcustomarraydeserializer.getWrite();
        }
        return _findcustomarraydeserializer.AudioAttributesCompatParcelizer(_findcustomarraydeserializer.getAudioAttributesCompatParcelizer().write(_findcustomarraydeserializer.AudioAttributesCompatParcelizer(p0)));
    }

    public final int write(long p0) {
        long j = -1;
        _findCustomArrayDeserializer _findcustomarraydeserializer = this.MediaDescriptionCompat.get(_addExplicitConstructorCreators.IconCompatParcelizer(this.MediaDescriptionCompat, Float.intBitsToFloat((int) (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & p0))));
        if (_findcustomarraydeserializer.IconCompatParcelizer() == 0) {
            return _findcustomarraydeserializer.getIconCompatParcelizer();
        }
        return _findcustomarraydeserializer.read(_findcustomarraydeserializer.getAudioAttributesCompatParcelizer().write(_findcustomarraydeserializer.read(p0)));
    }

    public final long IconCompatParcelizer(WritableTypeIdInclusion p0, int p1, _resolveInnerClassValuedProperty p2) {
        int iIconCompatParcelizer = _addExplicitConstructorCreators.IconCompatParcelizer(this.MediaDescriptionCompat, p0.getRemoteActionCompatParcelizer());
        if (this.MediaDescriptionCompat.get(iIconCompatParcelizer).getAudioAttributesImplBaseParcelizer() >= p0.getIconCompatParcelizer() || iIconCompatParcelizer == IntermediateLoginResponseBody.write((List) this.MediaDescriptionCompat)) {
            _findCustomArrayDeserializer _findcustomarraydeserializer = this.MediaDescriptionCompat.get(iIconCompatParcelizer);
            return _findCustomArrayDeserializer.read$default(_findcustomarraydeserializer, _findcustomarraydeserializer.getAudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(_findcustomarraydeserializer.write(p0), p1, p2), false, 1, null);
        }
        int iIconCompatParcelizer2 = _addExplicitConstructorCreators.IconCompatParcelizer(this.MediaDescriptionCompat, p0.getIconCompatParcelizer());
        long jAudioAttributesCompatParcelizer = findProperty.INSTANCE.AudioAttributesCompatParcelizer();
        while (findProperty.IconCompatParcelizer(jAudioAttributesCompatParcelizer, findProperty.INSTANCE.AudioAttributesCompatParcelizer()) && iIconCompatParcelizer <= iIconCompatParcelizer2) {
            _findCustomArrayDeserializer _findcustomarraydeserializer2 = this.MediaDescriptionCompat.get(iIconCompatParcelizer);
            jAudioAttributesCompatParcelizer = _findCustomArrayDeserializer.read$default(_findcustomarraydeserializer2, _findcustomarraydeserializer2.getAudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(_findcustomarraydeserializer2.write(p0), p1, p2), false, 1, null);
            iIconCompatParcelizer++;
        }
        if (findProperty.IconCompatParcelizer(jAudioAttributesCompatParcelizer, findProperty.INSTANCE.AudioAttributesCompatParcelizer())) {
            return findProperty.INSTANCE.AudioAttributesCompatParcelizer();
        }
        long jAudioAttributesCompatParcelizer2 = findProperty.INSTANCE.AudioAttributesCompatParcelizer();
        while (findProperty.IconCompatParcelizer(jAudioAttributesCompatParcelizer2, findProperty.INSTANCE.AudioAttributesCompatParcelizer()) && iIconCompatParcelizer <= iIconCompatParcelizer2) {
            _findCustomArrayDeserializer _findcustomarraydeserializer3 = this.MediaDescriptionCompat.get(iIconCompatParcelizer2);
            jAudioAttributesCompatParcelizer2 = _findCustomArrayDeserializer.read$default(_findcustomarraydeserializer3, _findcustomarraydeserializer3.getAudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(_findcustomarraydeserializer3.write(p0), p1, p2), false, 1, null);
            iIconCompatParcelizer2--;
        }
        return findProperty.IconCompatParcelizer(jAudioAttributesCompatParcelizer2, findProperty.INSTANCE.AudioAttributesCompatParcelizer()) ? jAudioAttributesCompatParcelizer : getValueInstantiator.write(findProperty.AudioAttributesImplBaseParcelizer(jAudioAttributesCompatParcelizer), findProperty.read(jAudioAttributesCompatParcelizer2));
    }

    public final WritableTypeIdInclusion read(int p0) {
        MediaBrowserCompatSearchResultReceiver(p0);
        _findCustomArrayDeserializer _findcustomarraydeserializer = this.MediaDescriptionCompat.get(_addExplicitConstructorCreators.read(this.MediaDescriptionCompat, p0));
        return _findcustomarraydeserializer.AudioAttributesCompatParcelizer(_findcustomarraydeserializer.getAudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(_findcustomarraydeserializer.write(p0)));
    }

    public final float[] AudioAttributesCompatParcelizer(final long p0, final float[] p1, int p2) {
        MediaBrowserCompatSearchResultReceiver(findProperty.MediaBrowserCompatCustomActionResultReceiver(p0));
        RatingCompat(findProperty.AudioAttributesImplApi26Parcelizer(p0));
        final MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer();
        iconCompatParcelizer.AudioAttributesCompatParcelizer = p2;
        final MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer();
        _addExplicitConstructorCreators.AudioAttributesCompatParcelizer(this.MediaDescriptionCompat, p0, new getAnswerMap() { // from class: o._mapAbstractType2
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return _checkImplicitlyNamedConstructors.IconCompatParcelizer(p0, p1, iconCompatParcelizer, remoteActionCompatParcelizer, (_findCustomArrayDeserializer) obj);
            }
        });
        return p1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(long j, float[] fArr, MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer, MagicModuleUseCaseImplWhenMappings.RemoteActionCompatParcelizer remoteActionCompatParcelizer, _findCustomArrayDeserializer _findcustomarraydeserializer) {
        long jWrite = getValueInstantiator.write(_findcustomarraydeserializer.write(_findcustomarraydeserializer.getIconCompatParcelizer() > findProperty.MediaBrowserCompatCustomActionResultReceiver(j) ? _findcustomarraydeserializer.getIconCompatParcelizer() : findProperty.MediaBrowserCompatCustomActionResultReceiver(j)), _findcustomarraydeserializer.write(_findcustomarraydeserializer.getRemoteActionCompatParcelizer() < findProperty.AudioAttributesImplApi26Parcelizer(j) ? _findcustomarraydeserializer.getRemoteActionCompatParcelizer() : findProperty.AudioAttributesImplApi26Parcelizer(j)));
        _findcustomarraydeserializer.getAudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(jWrite, fArr, iconCompatParcelizer.AudioAttributesCompatParcelizer);
        int iRemoteActionCompatParcelizer = iconCompatParcelizer.AudioAttributesCompatParcelizer + (findProperty.RemoteActionCompatParcelizer(jWrite) << 2);
        for (int i = iconCompatParcelizer.AudioAttributesCompatParcelizer; i < iRemoteActionCompatParcelizer; i += 4) {
            int i2 = i + 1;
            fArr[i2] = fArr[i2] + remoteActionCompatParcelizer.read;
            int i3 = i + 3;
            fArr[i3] = fArr[i3] + remoteActionCompatParcelizer.read;
        }
        iconCompatParcelizer.AudioAttributesCompatParcelizer = iRemoteActionCompatParcelizer;
        remoteActionCompatParcelizer.read += _findcustomarraydeserializer.getAudioAttributesCompatParcelizer().read();
        return getShowPopup.INSTANCE;
    }

    public final float RemoteActionCompatParcelizer(int p0, boolean p1) {
        int iWrite;
        RatingCompat(p0);
        if (p0 == RatingCompat().length()) {
            iWrite = IntermediateLoginResponseBody.write((List) this.MediaDescriptionCompat);
        } else {
            iWrite = _addExplicitConstructorCreators.read(this.MediaDescriptionCompat, p0);
        }
        _findCustomArrayDeserializer _findcustomarraydeserializer = this.MediaDescriptionCompat.get(iWrite);
        return _findcustomarraydeserializer.getAudioAttributesCompatParcelizer().write(_findcustomarraydeserializer.write(p0), p1);
    }

    public final _properties MediaBrowserCompatMediaItem(int p0) {
        int iWrite;
        RatingCompat(p0);
        if (p0 == RatingCompat().length()) {
            iWrite = IntermediateLoginResponseBody.write((List) this.MediaDescriptionCompat);
        } else {
            iWrite = _addExplicitConstructorCreators.read(this.MediaDescriptionCompat, p0);
        }
        _findCustomArrayDeserializer _findcustomarraydeserializer = this.MediaDescriptionCompat.get(iWrite);
        return _findcustomarraydeserializer.getAudioAttributesCompatParcelizer().MediaBrowserCompatMediaItem(_findcustomarraydeserializer.write(p0));
    }

    public final _properties AudioAttributesCompatParcelizer(int p0) {
        int iWrite;
        RatingCompat(p0);
        if (p0 == RatingCompat().length()) {
            iWrite = IntermediateLoginResponseBody.write((List) this.MediaDescriptionCompat);
        } else {
            iWrite = _addExplicitConstructorCreators.read(this.MediaDescriptionCompat, p0);
        }
        _findCustomArrayDeserializer _findcustomarraydeserializer = this.MediaDescriptionCompat.get(iWrite);
        return _findcustomarraydeserializer.getAudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(_findcustomarraydeserializer.write(p0));
    }

    public final long MediaMetadataCompat(int p0) {
        int iWrite;
        RatingCompat(p0);
        if (p0 == RatingCompat().length()) {
            iWrite = IntermediateLoginResponseBody.write((List) this.MediaDescriptionCompat);
        } else {
            iWrite = _addExplicitConstructorCreators.read(this.MediaDescriptionCompat, p0);
        }
        _findCustomArrayDeserializer _findcustomarraydeserializer = this.MediaDescriptionCompat.get(iWrite);
        return _findcustomarraydeserializer.read(_findcustomarraydeserializer.getAudioAttributesCompatParcelizer().MediaDescriptionCompat(_findcustomarraydeserializer.write(p0)), false);
    }

    public final WritableTypeIdInclusion IconCompatParcelizer(int p0) {
        int iWrite;
        RatingCompat(p0);
        if (p0 == RatingCompat().length()) {
            iWrite = IntermediateLoginResponseBody.write((List) this.MediaDescriptionCompat);
        } else {
            iWrite = _addExplicitConstructorCreators.read(this.MediaDescriptionCompat, p0);
        }
        _findCustomArrayDeserializer _findcustomarraydeserializer = this.MediaDescriptionCompat.get(iWrite);
        return _findcustomarraydeserializer.AudioAttributesCompatParcelizer(_findcustomarraydeserializer.getAudioAttributesCompatParcelizer().write(_findcustomarraydeserializer.write(p0)));
    }

    public final int write(int p0) {
        int iWrite;
        if (p0 >= RatingCompat().length()) {
            iWrite = IntermediateLoginResponseBody.write((List) this.MediaDescriptionCompat);
        } else {
            iWrite = p0 < 0 ? 0 : _addExplicitConstructorCreators.read(this.MediaDescriptionCompat, p0);
        }
        _findCustomArrayDeserializer _findcustomarraydeserializer = this.MediaDescriptionCompat.get(iWrite);
        return _findcustomarraydeserializer.AudioAttributesCompatParcelizer(_findcustomarraydeserializer.getAudioAttributesCompatParcelizer().AudioAttributesImplBaseParcelizer(_findcustomarraydeserializer.write(p0)));
    }

    public final float AudioAttributesImplApi21Parcelizer(int p0) {
        MediaDescriptionCompat(p0);
        _findCustomArrayDeserializer _findcustomarraydeserializer = this.MediaDescriptionCompat.get(_addExplicitConstructorCreators.write(this.MediaDescriptionCompat, p0));
        return _findcustomarraydeserializer.getAudioAttributesCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver(_findcustomarraydeserializer.IconCompatParcelizer(p0));
    }

    public final float AudioAttributesImplBaseParcelizer(int p0) {
        MediaDescriptionCompat(p0);
        _findCustomArrayDeserializer _findcustomarraydeserializer = this.MediaDescriptionCompat.get(_addExplicitConstructorCreators.write(this.MediaDescriptionCompat, p0));
        return _findcustomarraydeserializer.getAudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer(_findcustomarraydeserializer.IconCompatParcelizer(p0));
    }

    public final float MediaBrowserCompatCustomActionResultReceiver(int p0) {
        MediaDescriptionCompat(p0);
        _findCustomArrayDeserializer _findcustomarraydeserializer = this.MediaDescriptionCompat.get(_addExplicitConstructorCreators.write(this.MediaDescriptionCompat, p0));
        return _findcustomarraydeserializer.write(_findcustomarraydeserializer.getAudioAttributesCompatParcelizer().MediaBrowserCompatSearchResultReceiver(_findcustomarraydeserializer.IconCompatParcelizer(p0)));
    }

    public final float RemoteActionCompatParcelizer(int p0) {
        MediaDescriptionCompat(p0);
        _findCustomArrayDeserializer _findcustomarraydeserializer = this.MediaDescriptionCompat.get(_addExplicitConstructorCreators.write(this.MediaDescriptionCompat, p0));
        return _findcustomarraydeserializer.write(_findcustomarraydeserializer.getAudioAttributesCompatParcelizer().IconCompatParcelizer(_findcustomarraydeserializer.IconCompatParcelizer(p0)));
    }

    public final float AudioAttributesImplApi26Parcelizer(int p0) {
        MediaDescriptionCompat(p0);
        _findCustomArrayDeserializer _findcustomarraydeserializer = this.MediaDescriptionCompat.get(_addExplicitConstructorCreators.write(this.MediaDescriptionCompat, p0));
        return _findcustomarraydeserializer.getAudioAttributesCompatParcelizer().MediaBrowserCompatItemReceiver(_findcustomarraydeserializer.IconCompatParcelizer(p0));
    }

    public final int MediaBrowserCompatItemReceiver(int p0) {
        MediaDescriptionCompat(p0);
        _findCustomArrayDeserializer _findcustomarraydeserializer = this.MediaDescriptionCompat.get(_addExplicitConstructorCreators.write(this.MediaDescriptionCompat, p0));
        return _findcustomarraydeserializer.read(_findcustomarraydeserializer.getAudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer(_findcustomarraydeserializer.IconCompatParcelizer(p0)));
    }

    public static /* synthetic */ int IconCompatParcelizer$default(_checkImplicitlyNamedConstructors _checkimplicitlynamedconstructors, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return _checkimplicitlynamedconstructors.IconCompatParcelizer(i, z);
    }

    public final int IconCompatParcelizer(int p0, boolean p1) {
        MediaDescriptionCompat(p0);
        _findCustomArrayDeserializer _findcustomarraydeserializer = this.MediaDescriptionCompat.get(_addExplicitConstructorCreators.write(this.MediaDescriptionCompat, p0));
        return _findcustomarraydeserializer.read(_findcustomarraydeserializer.getAudioAttributesCompatParcelizer().IconCompatParcelizer(_findcustomarraydeserializer.IconCompatParcelizer(p0), p1));
    }

    private final void MediaBrowserCompatSearchResultReceiver(int p0) {
        if (p0 < 0 || p0 >= RatingCompat().getIconCompatParcelizer().length()) {
            StringBuilder sb = new StringBuilder("offset(");
            sb.append(p0);
            sb.append(") is out of bounds [0, ");
            sb.append(RatingCompat().length());
            sb.append(')');
            withStackTrace.read(sb.toString());
        }
    }

    private final void RatingCompat(int p0) {
        if (p0 < 0 || p0 > RatingCompat().getIconCompatParcelizer().length()) {
            StringBuilder sb = new StringBuilder("offset(");
            sb.append(p0);
            sb.append(") is out of bounds [0, ");
            sb.append(RatingCompat().length());
            sb.append(']');
            withStackTrace.read(sb.toString());
        }
    }

    private final void MediaDescriptionCompat(int p0) {
        if (p0 < 0 || p0 >= this.AudioAttributesImplBaseParcelizer) {
            StringBuilder sb = new StringBuilder("lineIndex(");
            sb.append(p0);
            sb.append(") is out of bounds [0, ");
            sb.append(this.AudioAttributesImplBaseParcelizer);
            sb.append(')');
            withStackTrace.read(sb.toString());
        }
    }

    public /* synthetic */ _checkImplicitlyNamedConstructors(_findParamName _findparamname, long j, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(_findparamname, j, i, i2);
    }
}
