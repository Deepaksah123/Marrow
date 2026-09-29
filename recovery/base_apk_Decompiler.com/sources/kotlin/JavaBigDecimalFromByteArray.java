package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB1\u0012(\b\u0002\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u000f\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0011JC\u0010\r\u001a\u00020\u000b*\u00020\u00122&\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u0013R4\u0010\u0016\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00128\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\u001a\"\u0004\b\r\u0010\u001bR \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lo/JavaBigDecimalFromByteArray;", "Lo/subtractTimesI;", "", "", "", "", "", "p0", "<init>", "(Ljava/util/Map;)V", "Lkotlin/Function0;", "", "p1", "RemoteActionCompatParcelizer", "(Ljava/lang/Object;Lo/MagicModuleSubmissionRequestBody;Lo/_handleUnrecognizedCharacterEscape;I)V", "IconCompatParcelizer", "()Ljava/util/Map;", "(Ljava/lang/Object;)V", "Lo/JavaBigIntegerFromCharSequence;", "(Lo/JavaBigIntegerFromCharSequence;Ljava/util/Map;Ljava/lang/Object;)V", "AudioAttributesImplApi21Parcelizer", "Ljava/util/Map;", "read", "Lo/setKeyListener;", "AudioAttributesCompatParcelizer", "Lo/setKeyListener;", "Lo/JavaBigIntegerFromCharSequence;", "(Lo/JavaBigIntegerFromCharSequence;)V", "Lkotlin/Function1;", "", "write", "Lo/getAnswerMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class JavaBigDecimalFromByteArray implements subtractTimesI {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final parseManyDecDigits<JavaBigDecimalFromByteArray, ?> read = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.JavaBigDecimalFromCharSequence
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return JavaBigDecimalFromByteArray.read((JavaDoubleBitsFromCharSequence) obj, (JavaBigDecimalFromByteArray) obj2);
        }
    }, new getAnswerMap() { // from class: o.JavaBigIntegerFromCharArray
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return JavaBigDecimalFromByteArray.IconCompatParcelizer((Map) obj);
        }
    });

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final setKeyListener<Object, JavaBigIntegerFromCharSequence> IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final Map<Object, Map<String, List<Object>>> read;
    private JavaBigIntegerFromCharSequence RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getAnswerMap<Object, Boolean> AudioAttributesCompatParcelizer;

    public JavaBigDecimalFromByteArray(Map<Object, Map<String, List<Object>>> map) {
        this.read = map;
        this.IconCompatParcelizer = setAutoSizeTextTypeUniformWithPresetSizes.read();
        this.AudioAttributesCompatParcelizer = new getAnswerMap() { // from class: o.parseBigDecimalString
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(JavaBigDecimalFromByteArray.write(this.AudioAttributesCompatParcelizer, obj));
            }
        };
    }

    public /* synthetic */ JavaBigDecimalFromByteArray(LinkedHashMap linkedHashMap, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? new LinkedHashMap() : linkedHashMap);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¸\u0006\u0005"}, d2 = {"Lo/StreamConstraintsException$read;", "Lo/_wrapError;", "", "RemoteActionCompatParcelizer", "()V", "o/StreamConstraintsException$read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write implements _wrapError {
        final /* synthetic */ skipZeroes IconCompatParcelizer;
        final /* synthetic */ Object RemoteActionCompatParcelizer;

        public write(Object obj, skipZeroes skipzeroes) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer = skipzeroes;
        }

        @Override // kotlin._wrapError
        public final void RemoteActionCompatParcelizer() {
            Object objIconCompatParcelizer = JavaBigDecimalFromByteArray.this.IconCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
            skipZeroes skipzeroes = this.IconCompatParcelizer;
            if (objIconCompatParcelizer == skipzeroes) {
                JavaBigDecimalFromByteArray javaBigDecimalFromByteArray = JavaBigDecimalFromByteArray.this;
                javaBigDecimalFromByteArray.RemoteActionCompatParcelizer(skipzeroes, javaBigDecimalFromByteArray.read, this.RemoteActionCompatParcelizer);
            }
        }
    }

    public final void RemoteActionCompatParcelizer(JavaBigIntegerFromCharSequence javaBigIntegerFromCharSequence) {
        this.RemoteActionCompatParcelizer = javaBigIntegerFromCharSequence;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean write(JavaBigDecimalFromByteArray javaBigDecimalFromByteArray, Object obj) {
        JavaBigIntegerFromCharSequence javaBigIntegerFromCharSequence = javaBigDecimalFromByteArray.RemoteActionCompatParcelizer;
        if (javaBigIntegerFromCharSequence != null) {
            return javaBigIntegerFromCharSequence.AudioAttributesCompatParcelizer(obj);
        }
        return true;
    }

    @Override // kotlin.subtractTimesI
    public final void RemoteActionCompatParcelizer(final Object obj, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(533563200);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(this) ? 256 : 128;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 147) != 146, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(533563200, i2, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:70)");
            }
            _handleunrecognizedcharacterescapeWrite.write(207, obj);
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                if (!this.AudioAttributesCompatParcelizer.invoke(obj).booleanValue()) {
                    StringBuilder sb = new StringBuilder("Type of the key ");
                    sb.append(obj);
                    sb.append(" is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                skipZeroes skipzeroes = new skipZeroes(parseBigIntegerLiteral.AudioAttributesCompatParcelizer(this.read.get(obj), this.AudioAttributesCompatParcelizer));
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(skipzeroes);
                objOnPause = skipzeroes;
            }
            final skipZeroes skipzeroes2 = (skipZeroes) objOnPause;
            resetAsNaN.AudioAttributesCompatParcelizer(new ContentReference[]{parseBigIntegerLiteral.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(skipzeroes2), setCenterTextSize.read().AudioAttributesCompatParcelizer(skipzeroes2)}, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescapeWrite, (i2 & 112) | ContentReference.write);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(this);
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(obj);
            boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(skipzeroes2);
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if ((zIconCompatParcelizer | zIconCompatParcelizer2 | zIconCompatParcelizer3) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getAnswerMap() { // from class: o.JavaBigDecimalFromCharArray
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj2) {
                        return JavaBigDecimalFromByteArray.IconCompatParcelizer(this.RemoteActionCompatParcelizer, obj, skipzeroes2, (StreamConstraintsException) obj2);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            StreamReadException.RemoteActionCompatParcelizer(getshowpopup, (getAnswerMap) objOnPause2, _handleunrecognizedcharacterescapeWrite, 6);
            _handleunrecognizedcharacterescapeWrite.MediaDescriptionCompat();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.valueOfBigDecimalString
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj2, Object obj3) {
                    return JavaBigDecimalFromByteArray.read(this.write, obj, magicModuleSubmissionRequestBody, i, (_handleUnrecognizedCharacterEscape) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _wrapError IconCompatParcelizer(JavaBigDecimalFromByteArray javaBigDecimalFromByteArray, Object obj, skipZeroes skipzeroes, StreamConstraintsException streamConstraintsException) {
        if (javaBigDecimalFromByteArray.IconCompatParcelizer.read(obj)) {
            StringBuilder sb = new StringBuilder("Key ");
            sb.append(obj);
            sb.append(" was used multiple times ");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        javaBigDecimalFromByteArray.read.remove(obj);
        javaBigDecimalFromByteArray.IconCompatParcelizer.RemoteActionCompatParcelizer(obj, skipzeroes);
        return javaBigDecimalFromByteArray.new write(obj, skipzeroes);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.Map<java.lang.Object, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>> IconCompatParcelizer() {
        /*
            r17 = this;
            r0 = r17
            java.util.Map<java.lang.Object, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>> r1 = r0.read
            o.setKeyListener<java.lang.Object, o.JavaBigIntegerFromCharSequence> r2 = r0.IconCompatParcelizer
            o.AppCompatButton r2 = (kotlin.AppCompatButton) r2
            java.lang.Object[] r3 = r2.IconCompatParcelizer
            java.lang.Object[] r4 = r2.MediaBrowserCompatItemReceiver
            long[] r2 = r2.RemoteActionCompatParcelizer
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L51
            r6 = 0
            r7 = r6
        L15:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2f:
            if (r12 >= r10) goto L4a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L46
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            o.JavaBigIntegerFromCharSequence r13 = (kotlin.JavaBigIntegerFromCharSequence) r13
            r0.RemoteActionCompatParcelizer(r13, r1, r14)
        L46:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2f
        L4a:
            if (r10 != r11) goto L51
        L4c:
            if (r7 == r5) goto L51
            int r7 = r7 + 1
            goto L15
        L51:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L59
            r0 = 0
            return r0
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.JavaBigDecimalFromByteArray.IconCompatParcelizer():java.util.Map");
    }

    @Override // kotlin.subtractTimesI
    public final void IconCompatParcelizer(Object p0) {
        if (this.IconCompatParcelizer.IconCompatParcelizer(p0) == null) {
            this.read.remove(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(JavaBigIntegerFromCharSequence javaBigIntegerFromCharSequence, Map<Object, Map<String, List<Object>>> map, Object obj) {
        Map<String, List<Object>> map2 = javaBigIntegerFromCharSequence.read();
        if (map2.isEmpty()) {
            map.remove(obj);
        } else {
            map.put(obj, map2);
        }
    }

    /* JADX INFO: renamed from: o.JavaBigDecimalFromByteArray$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b"}, d2 = {"Lo/JavaBigDecimalFromByteArray$IconCompatParcelizer;", "", "<init>", "()V", "Lo/parseManyDecDigits;", "Lo/JavaBigDecimalFromByteArray;", "read", "Lo/parseManyDecDigits;", "()Lo/parseManyDecDigits;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final parseManyDecDigits<JavaBigDecimalFromByteArray, ?> read() {
            return JavaBigDecimalFromByteArray.read;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JavaBigDecimalFromByteArray IconCompatParcelizer(Map map) {
        return new JavaBigDecimalFromByteArray(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map read(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, JavaBigDecimalFromByteArray javaBigDecimalFromByteArray) {
        return javaBigDecimalFromByteArray.IconCompatParcelizer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JavaBigDecimalFromByteArray() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(JavaBigDecimalFromByteArray javaBigDecimalFromByteArray, Object obj, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        javaBigDecimalFromByteArray.RemoteActionCompatParcelizer(obj, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
