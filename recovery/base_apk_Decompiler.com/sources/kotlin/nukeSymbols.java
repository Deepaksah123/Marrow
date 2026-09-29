package kotlin;

import android.view.KeyEvent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\tH&¢\u0006\u0004\b\u0007\u0010\fJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0007\u001a\u00020\u000fH&¢\u0006\u0004\b\u0007\u0010\u0011J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H&¢\u0006\u0004\b\u001a\u0010\u0019J'\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001b2\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001bH&¢\u0006\u0004\b\r\u0010\u001fJ%\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020 2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u001cH&¢\u0006\u0004\b\u001d\u0010!J\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\"H&¢\u0006\u0004\b\u001d\u0010#J\u000f\u0010\u0014\u001a\u00020\u000fH&¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u001d\u001a\u00020\u000fH&¢\u0006\u0004\b\u001d\u0010\u0011J\u0017\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\nH&¢\u0006\u0004\b\u0007\u0010$J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020%H&¢\u0006\u0004\b\u0016\u0010&J\u000f\u0010'\u001a\u00020\u000fH&¢\u0006\u0004\b'\u0010\u0011R\u0014\u0010\u001d\u001a\u00020(8'X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020,0+8'X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u0010\u0014\u001a\u00020/8'X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\n8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\r\u00102\"\u0004\b\u0014\u0010$R\u0016\u0010\u0007\u001a\u00020\u00068'@&X¦\f¢\u0006\u0006\u001a\u0004\b3\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/nukeSymbols;", "Lo/_resizeAndFindOffsetForAdd;", "Lo/_checkNeedForRehash;", "p0", "Lo/WritableTypeIdInclusion;", "p1", "", "AudioAttributesCompatParcelizer", "(Lo/_checkNeedForRehash;Lo/WritableTypeIdInclusion;)Z", "Lkotlin/Function1;", "Lo/_handleSpillOverflow;", "p2", "(ILo/WritableTypeIdInclusion;Lo/getAnswerMap;)Ljava/lang/Boolean;", "read", "(IZ)Z", "", "MediaBrowserCompatSearchResultReceiver", "()V", "p3", "(ZZZI)Z", "IconCompatParcelizer", "(I)Z", "write", "()Lo/WritableTypeIdInclusion;", "AudioAttributesImplApi26Parcelizer", "()Z", "MediaBrowserCompatItemReceiver", "Lo/constructType;", "Lkotlin/Function0;", "RemoteActionCompatParcelizer", "(Landroid/view/KeyEvent;Lo/getCreatedOnDateMs;)Z", "(Landroid/view/KeyEvent;)Z", "Lo/weirdNativeValueException;", "(Lo/weirdNativeValueException;Lo/getCreatedOnDateMs;)Z", "Lo/DatabindContext;", "(Lo/DatabindContext;)Z", "(Lo/_handleSpillOverflow;)V", "Lo/ByteQuadsCanonicalizer;", "(Lo/ByteQuadsCanonicalizer;)V", "MediaDescriptionCompat", "Lo/_handleOddName;", "AudioAttributesImplBaseParcelizer", "()Lo/_handleOddName;", "Lo/setDropDownBackgroundResource;", "Lo/_verifyLongName;", "MediaBrowserCompatCustomActionResultReceiver", "()Lo/setDropDownBackgroundResource;", "Lo/CharsToNameCanonicalizer;", "AudioAttributesImplApi21Parcelizer", "()Lo/CharsToNameCanonicalizer;", "()Lo/_handleSpillOverflow;", "MediaBrowserCompatMediaItem"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface nukeSymbols extends _resizeAndFindOffsetForAdd {
    Boolean AudioAttributesCompatParcelizer(int p0, WritableTypeIdInclusion p1, getAnswerMap<? super _handleSpillOverflow, Boolean> p2);

    void AudioAttributesCompatParcelizer();

    void AudioAttributesCompatParcelizer(_handleSpillOverflow p0);

    boolean AudioAttributesCompatParcelizer(_checkNeedForRehash p0, WritableTypeIdInclusion p1);

    CharsToNameCanonicalizer AudioAttributesImplApi21Parcelizer();

    boolean AudioAttributesImplApi26Parcelizer();

    _handleOddName AudioAttributesImplBaseParcelizer();

    void IconCompatParcelizer();

    void IconCompatParcelizer(_handleSpillOverflow _handlespilloverflow);

    boolean IconCompatParcelizer(int p0);

    setDropDownBackgroundResource<_verifyLongName> MediaBrowserCompatCustomActionResultReceiver();

    boolean MediaBrowserCompatItemReceiver();

    boolean MediaBrowserCompatMediaItem();

    void MediaBrowserCompatSearchResultReceiver();

    void MediaDescriptionCompat();

    void RemoteActionCompatParcelizer();

    boolean RemoteActionCompatParcelizer(KeyEvent p0, getCreatedOnDateMs<Boolean> p1);

    boolean RemoteActionCompatParcelizer(DatabindContext p0);

    boolean RemoteActionCompatParcelizer(weirdNativeValueException p0, getCreatedOnDateMs<Boolean> p1);

    _handleSpillOverflow read();

    boolean read(int p0, boolean p1);

    boolean read(KeyEvent p0);

    boolean read(boolean p0, boolean p1, boolean p2, int p3);

    WritableTypeIdInclusion write();

    void write(ByteQuadsCanonicalizer p0);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: o.nukeSymbols$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "RemoteActionCompatParcelizer", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<Boolean> {
        public static final AnonymousClass5 RemoteActionCompatParcelizer = new AnonymousClass5();

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }

        AnonymousClass5() {
            super(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean RemoteActionCompatParcelizer$default(nukeSymbols nukesymbols, KeyEvent keyEvent, getCreatedOnDateMs getcreatedondatems, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
        }
        if ((i & 2) != 0) {
            getcreatedondatems = AnonymousClass5.RemoteActionCompatParcelizer;
        }
        return nukesymbols.RemoteActionCompatParcelizer(keyEvent, (getCreatedOnDateMs<Boolean>) getcreatedondatems);
    }
}
