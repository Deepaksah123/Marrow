package kotlin;

import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\b\u001a\u0013\u0010\n\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\b\u001a\u0013\u0010\u0003\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0003\u0010\b\u001a\u0013\u0010\n\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\n\u0010\r\u001a+\u0010\t\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\t\u0010\u0014\u001a3\u0010\u0016\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0003\u0010\u0018\u001a#\u0010\u0003\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u0003\u0010\u001a\u001a\u001b\u0010\n\u001a\u00020\u0006*\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u001c\u001a7\u0010\u0003\u001a\u00020\u0000*\u0004\u0018\u00010\u001d2\u0006\u0010\u0002\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0003\u0010\u001f\u001a/\u0010\u0003\u001a\u00020\u0005*\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u0003\u0010 \u001a9\u0010\u0003\u001a\u00020\u0000*\u0004\u0018\u00010\u001b2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u0003\u0010!\u001a%\u0010\n\u001a\u00020\u0005*\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\n\u0010\"\u001a#\u0010\n\u001a\u00020$2\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020$0#\"\u00020$H\u0002¢\u0006\u0004\b\n\u0010%\u001a\u001f\u0010\n\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010&"}, d2 = {"Lo/findProperty;", "", "p0", "AudioAttributesCompatParcelizer", "(JLjava/lang/CharSequence;)J", "", "", "RemoteActionCompatParcelizer", "(I)Z", "write", "read", "Landroid/graphics/PointF;", "Lo/getReferencedType;", "(Landroid/graphics/PointF;)J", "Lo/setImageDisplayMode;", "Lo/WritableTypeIdInclusion;", "Lo/_handleTypedObjectId;", "p1", "Lo/_resolveInnerClassValuedProperty;", "p2", "(Lo/setImageDisplayMode;Lo/WritableTypeIdInclusion;ILo/_resolveInnerClassValuedProperty;)J", "p3", "IconCompatParcelizer", "(Lo/setImageDisplayMode;Lo/WritableTypeIdInclusion;Lo/WritableTypeIdInclusion;ILo/_resolveInnerClassValuedProperty;)J", "(Ljava/lang/CharSequence;I)J", "Lo/CoercionConfig;", "(Lo/setImageDisplayMode;JLo/CoercionConfig;)I", "Lo/deserializeFromNumber;", "(Lo/deserializeFromNumber;I)Z", "Lo/_checkImplicitlyNamedConstructors;", "Lo/isAbstract;", "(Lo/_checkImplicitlyNamedConstructors;Lo/WritableTypeIdInclusion;Lo/isAbstract;ILo/_resolveInnerClassValuedProperty;)J", "(Lo/_checkImplicitlyNamedConstructors;JLo/isAbstract;Lo/CoercionConfig;)I", "(Lo/deserializeFromNumber;JJLo/isAbstract;Lo/CoercionConfig;)J", "(Lo/_checkImplicitlyNamedConstructors;JLo/CoercionConfig;)I", "", "Lo/findBeanDeserializer;", "([Lo/findBeanDeserializer;)Lo/findBeanDeserializer;", "(JJ)J"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setOnPageChangeListener {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long AudioAttributesCompatParcelizer(long j, CharSequence charSequence) {
        int iAudioAttributesImplBaseParcelizer = findProperty.AudioAttributesImplBaseParcelizer(j);
        int iCharCount = findProperty.read(j);
        int iCodePointBefore = iAudioAttributesImplBaseParcelizer > 0 ? Character.codePointBefore(charSequence, iAudioAttributesImplBaseParcelizer) : 10;
        int iCodePointAt = iCharCount < charSequence.length() ? Character.codePointAt(charSequence, iCharCount) : 10;
        if (read(iCodePointBefore) && (write(iCodePointAt) || AudioAttributesCompatParcelizer(iCodePointAt))) {
            do {
                iAudioAttributesImplBaseParcelizer -= Character.charCount(iCodePointBefore);
                if (iAudioAttributesImplBaseParcelizer == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iAudioAttributesImplBaseParcelizer);
            } while (read(iCodePointBefore));
            return getValueInstantiator.write(iAudioAttributesImplBaseParcelizer, iCharCount);
        }
        if (!read(iCodePointAt)) {
            return j;
        }
        if (!write(iCodePointBefore) && !AudioAttributesCompatParcelizer(iCodePointBefore)) {
            return j;
        }
        do {
            iCharCount += Character.charCount(iCodePointAt);
            if (iCharCount == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, iCharCount);
        } while (read(iCodePointAt));
        return getValueInstantiator.write(iAudioAttributesImplBaseParcelizer, iCharCount);
    }

    private static final boolean RemoteActionCompatParcelizer(int i) {
        int type = Character.getType(i);
        return type == 14 || type == 13 || i == 10;
    }

    private static final boolean write(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    private static final boolean read(int i) {
        return write(i) && !RemoteActionCompatParcelizer(i);
    }

    private static final boolean AudioAttributesCompatParcelizer(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long read(PointF pointF) {
        long j = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(pointF.x)) << 32) | (((long) Float.floatToRawIntBits(pointF.y)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long write(setImageDisplayMode setimagedisplaymode, WritableTypeIdInclusion writableTypeIdInclusion, int i, _resolveInnerClassValuedProperty _resolveinnerclassvaluedproperty) {
        deserializeFromNumber audioAttributesCompatParcelizer;
        hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer = setimagedisplaymode.AudioAttributesImplApi26Parcelizer();
        return AudioAttributesCompatParcelizer((hasstableidsAudioAttributesImplApi26Parcelizer == null || (audioAttributesCompatParcelizer = hasstableidsAudioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer()) == null) ? null : audioAttributesCompatParcelizer.getWrite(), writableTypeIdInclusion, setimagedisplaymode.MediaBrowserCompatCustomActionResultReceiver(), i, _resolveinnerclassvaluedproperty);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long IconCompatParcelizer(setImageDisplayMode setimagedisplaymode, WritableTypeIdInclusion writableTypeIdInclusion, WritableTypeIdInclusion writableTypeIdInclusion2, int i, _resolveInnerClassValuedProperty _resolveinnerclassvaluedproperty) {
        long jWrite = write(setimagedisplaymode, writableTypeIdInclusion, i, _resolveinnerclassvaluedproperty);
        if (findProperty.write(jWrite)) {
            return findProperty.INSTANCE.AudioAttributesCompatParcelizer();
        }
        long jWrite2 = write(setimagedisplaymode, writableTypeIdInclusion2, i, _resolveinnerclassvaluedproperty);
        return findProperty.write(jWrite2) ? findProperty.INSTANCE.AudioAttributesCompatParcelizer() : read(jWrite, jWrite2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AudioAttributesCompatParcelizer(CharSequence charSequence, int i) {
        int iCharCount = i;
        while (iCharCount > 0) {
            int iAudioAttributesCompatParcelizer = getPathName.AudioAttributesCompatParcelizer(charSequence, iCharCount);
            if (!write(iAudioAttributesCompatParcelizer)) {
                break;
            }
            iCharCount -= Character.charCount(iAudioAttributesCompatParcelizer);
        }
        while (i < charSequence.length()) {
            int i2 = getPathName.read(charSequence, i);
            if (!write(i2)) {
                break;
            }
            i += getPathName.write(i2);
        }
        return getValueInstantiator.write(iCharCount, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AudioAttributesCompatParcelizer(setImageDisplayMode setimagedisplaymode, long j, CoercionConfig coercionConfig) {
        deserializeFromNumber audioAttributesCompatParcelizer;
        _checkImplicitlyNamedConstructors write;
        hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer = setimagedisplaymode.AudioAttributesImplApi26Parcelizer();
        if (hasstableidsAudioAttributesImplApi26Parcelizer == null || (audioAttributesCompatParcelizer = hasstableidsAudioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer()) == null || (write = audioAttributesCompatParcelizer.getWrite()) == null) {
            return -1;
        }
        return AudioAttributesCompatParcelizer(write, j, setimagedisplaymode.MediaBrowserCompatCustomActionResultReceiver(), coercionConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean read(deserializeFromNumber deserializefromnumber, int i) {
        int iAudioAttributesCompatParcelizer = deserializefromnumber.AudioAttributesCompatParcelizer(i);
        return (i == deserializefromnumber.AudioAttributesImplApi26Parcelizer(iAudioAttributesCompatParcelizer) || i == deserializeFromNumber.write$default(deserializefromnumber, iAudioAttributesCompatParcelizer, false, 2, null)) ? deserializefromnumber.AudioAttributesImplApi21Parcelizer(i) != deserializefromnumber.RemoteActionCompatParcelizer(i) : deserializefromnumber.RemoteActionCompatParcelizer(i) != deserializefromnumber.RemoteActionCompatParcelizer(i - 1);
    }

    private static final long AudioAttributesCompatParcelizer(_checkImplicitlyNamedConstructors _checkimplicitlynamedconstructors, WritableTypeIdInclusion writableTypeIdInclusion, isAbstract isabstract, int i, _resolveInnerClassValuedProperty _resolveinnerclassvaluedproperty) {
        if (_checkimplicitlynamedconstructors == null || isabstract == null) {
            return findProperty.INSTANCE.AudioAttributesCompatParcelizer();
        }
        return _checkimplicitlynamedconstructors.IconCompatParcelizer(writableTypeIdInclusion.RemoteActionCompatParcelizer(isabstract.AudioAttributesCompatParcelizer(getReferencedType.INSTANCE.write())), i, _resolveinnerclassvaluedproperty);
    }

    private static final int AudioAttributesCompatParcelizer(_checkImplicitlyNamedConstructors _checkimplicitlynamedconstructors, long j, isAbstract isabstract, CoercionConfig coercionConfig) {
        long jAudioAttributesCompatParcelizer;
        int i;
        if (isabstract == null || (i = read(_checkimplicitlynamedconstructors, (jAudioAttributesCompatParcelizer = isabstract.AudioAttributesCompatParcelizer(j)), coercionConfig)) == -1) {
            return -1;
        }
        return _checkimplicitlynamedconstructors.write(getReferencedType.read$default(jAudioAttributesCompatParcelizer, BitmapDescriptorFactory.HUE_RED, (_checkimplicitlynamedconstructors.MediaBrowserCompatCustomActionResultReceiver(i) + _checkimplicitlynamedconstructors.RemoteActionCompatParcelizer(i)) / 2.0f, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AudioAttributesCompatParcelizer(deserializeFromNumber deserializefromnumber, long j, long j2, isAbstract isabstract, CoercionConfig coercionConfig) {
        if (deserializefromnumber == null || isabstract == null) {
            return findProperty.INSTANCE.AudioAttributesCompatParcelizer();
        }
        long jAudioAttributesCompatParcelizer = isabstract.AudioAttributesCompatParcelizer(j);
        long jAudioAttributesCompatParcelizer2 = isabstract.AudioAttributesCompatParcelizer(j2);
        int iMin = read(deserializefromnumber.getWrite(), jAudioAttributesCompatParcelizer, coercionConfig);
        int i = read(deserializefromnumber.getWrite(), jAudioAttributesCompatParcelizer2, coercionConfig);
        if (iMin == -1) {
            if (i == -1) {
                return findProperty.INSTANCE.AudioAttributesCompatParcelizer();
            }
            iMin = i;
        } else if (i != -1) {
            iMin = Math.min(iMin, i);
        }
        float fAudioAttributesImplBaseParcelizer = (deserializefromnumber.AudioAttributesImplBaseParcelizer(iMin) + deserializefromnumber.read(iMin)) / 2.0f;
        int i2 = (int) (jAudioAttributesCompatParcelizer >> 32);
        int i3 = (int) (jAudioAttributesCompatParcelizer2 >> 32);
        return deserializefromnumber.getWrite().IconCompatParcelizer(new WritableTypeIdInclusion(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), fAudioAttributesImplBaseParcelizer - 0.1f, Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), fAudioAttributesImplBaseParcelizer + 0.1f), _handleTypedObjectId.INSTANCE.IconCompatParcelizer(), _resolveInnerClassValuedProperty.INSTANCE.IconCompatParcelizer());
    }

    private static final int read(_checkImplicitlyNamedConstructors _checkimplicitlynamedconstructors, long j, CoercionConfig coercionConfig) {
        float fAudioAttributesImplApi26Parcelizer = coercionConfig != null ? coercionConfig.AudioAttributesImplApi26Parcelizer() : BitmapDescriptorFactory.HUE_RED;
        long j2 = -1;
        int i = (int) (((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))) & j);
        int iRemoteActionCompatParcelizer = _checkimplicitlynamedconstructors.RemoteActionCompatParcelizer(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) >= _checkimplicitlynamedconstructors.MediaBrowserCompatCustomActionResultReceiver(iRemoteActionCompatParcelizer) - fAudioAttributesImplApi26Parcelizer && Float.intBitsToFloat(i) <= _checkimplicitlynamedconstructors.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer) + fAudioAttributesImplApi26Parcelizer) {
            int i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) >= (-fAudioAttributesImplApi26Parcelizer) && Float.intBitsToFloat(i2) <= _checkimplicitlynamedconstructors.getIconCompatParcelizer() + fAudioAttributesImplApi26Parcelizer) {
                return iRemoteActionCompatParcelizer;
            }
        }
        return -1;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/setOnPageChangeListener$IconCompatParcelizer;", "Lo/findBeanDeserializer;", "Lo/findReferenceDeserializer;", "p0", "", "read", "(Lo/findReferenceDeserializer;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer implements findBeanDeserializer {
        final /* synthetic */ findBeanDeserializer[] RemoteActionCompatParcelizer;

        IconCompatParcelizer(findBeanDeserializer[] findbeandeserializerArr) {
            this.RemoteActionCompatParcelizer = findbeandeserializerArr;
        }

        @Override // kotlin.findBeanDeserializer
        public final void read(findReferenceDeserializer p0) {
            for (findBeanDeserializer findbeandeserializer : this.RemoteActionCompatParcelizer) {
                findbeandeserializer.read(p0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final findBeanDeserializer read(findBeanDeserializer... findbeandeserializerArr) {
        return new IconCompatParcelizer(findbeandeserializerArr);
    }

    private static final long read(long j, long j2) {
        return getValueInstantiator.write(Math.min(findProperty.AudioAttributesImplBaseParcelizer(j), findProperty.AudioAttributesImplBaseParcelizer(j)), Math.max(findProperty.read(j2), findProperty.read(j2)));
    }
}
