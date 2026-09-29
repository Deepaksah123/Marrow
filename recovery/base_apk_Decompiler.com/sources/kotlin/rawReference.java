package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 +2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001+B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0007J\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u0011J)\u0010\u0012\u001a\u00020\t2\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013H\u0016¢\u0006\u0004\b\u0012\u0010\u0015J\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0014¢\u0006\u0004\b\u000e\u0010\u0016J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0011J\u0015\u0010\n\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u0019J#\u0010\u0012\u001a\u00020\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00182\b\u0010\u0005\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001d\u0010\u0019J1\u0010\u001d\u001a\u00020\u0018*\u0006\u0012\u0002\b\u00030\u001a2\u0018\u0010\u0005\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001eH\u0002¢\u0006\u0004\b\u001d\u0010\u001fJ\r\u0010 \u001a\u00020\t¢\u0006\u0004\b \u0010\u0011J#\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t\u0018\u00010!2\u0006\u0010\u0005\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010#R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\f¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0016\u0010\u001d\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010+\u001a\u0004\u0018\u00010'8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010(\u001a\u0004\b\n\u0010)\"\u0004\b\u0012\u0010*R\u0011\u0010\n\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u0012\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u001d\u0010-R$\u00101\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010-\"\u0004\b/\u00100R$\u00104\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010-\"\u0004\b3\u00100R$\u0010/\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010-\"\u0004\b1\u00100R$\u00103\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010-\"\u0004\b\u001d\u00100R$\u0010%\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010-\"\u0004\b4\u00100R$\u0010.\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010-\"\u0004\b\u000e\u00100R$\u00105\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010-\"\u0004\b+\u00100R$\u00102\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010-\"\u0004\b\u0012\u00100R*\u00107\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u00106R\u0016\u0010,\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u0010&R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u0001088\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00109R*\u0010\u0010\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u0010:R$\u0010<\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188C@CX\u0082\u000e¢\u0006\f\u001a\u0004\b;\u0010-\"\u0004\b%\u00100R$\u0010 \u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010-\"\u0004\b\n\u00100R$\u0010;\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188A@CX\u0080\u000e¢\u0006\f\u001a\u0004\b7\u0010-\"\u0004\b5\u00100R\u0011\u0010=\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b5\u0010-"}, d2 = {"Lo/rawReference;", "Lo/releaseNameCopyBuffer;", "Lo/escapesFor;", "Lo/_checkMatchEnd;", "Lo/_append;", "p0", "<init>", "(Lo/_append;)V", "Lo/_handleUnrecognizedCharacterEscape;", "", "IconCompatParcelizer", "(Lo/_handleUnrecognizedCharacterEscape;)V", "", "Lo/_includeScalar;", "AudioAttributesCompatParcelizer", "(Ljava/lang/Object;)Lo/_includeScalar;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()V", "read", "Lkotlin/Function2;", "", "(Lo/MagicModuleSubmissionRequestBody;)V", "(I)V", "onCommand", "", "(Ljava/lang/Object;)Z", "Lo/reportInvalidNumber;", "p1", "(Lo/reportInvalidNumber;Ljava/lang/Object;)V", "write", "Lo/setKeyListener;", "(Lo/reportInvalidNumber;Lo/setKeyListener;)Z", "handleMediaPlayPauseIfPendingOnHandler", "Lkotlin/Function1;", "Lo/createChildArrayContext;", "(I)Lo/getAnswerMap;", "Lo/_append;", "MediaBrowserCompatCustomActionResultReceiver", "I", "Lo/_parseSlowFloat;", "Lo/_parseSlowFloat;", "()Lo/_parseSlowFloat;", "(Lo/_parseSlowFloat;)V", "RemoteActionCompatParcelizer", "MediaBrowserCompatSearchResultReceiver", "()Z", "MediaBrowserCompatMediaItem", "AudioAttributesImplApi21Parcelizer", "(Z)V", "AudioAttributesImplBaseParcelizer", "MediaMetadataCompat", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "MediaDescriptionCompat", "Lo/MagicModuleSubmissionRequestBody;", "RatingCompat", "Lo/AlertDialogLayout;", "Lo/AlertDialogLayout;", "Lo/setKeyListener;", "onAddQueueItem", "onCustomAction", "onMediaButtonEvent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class rawReference implements releaseNameCopyBuffer, escapesFor, _checkMatchEnd {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int write = 8;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> RatingCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private int MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private AlertDialogLayout<Object> onCommand;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private setKeyListener<reportInvalidNumber<?>, Object> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private _parseSlowFloat RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private int write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public _append AudioAttributesCompatParcelizer;

    public rawReference(_append _appendVar) {
        this.AudioAttributesCompatParcelizer = _appendVar;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final _parseSlowFloat getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void read(_parseSlowFloat _parseslowfloat) {
        this.RemoteActionCompatParcelizer = _parseslowfloat;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        _parseSlowFloat _parseslowfloat;
        return (this.AudioAttributesCompatParcelizer == null || (_parseslowfloat = this.RemoteActionCompatParcelizer) == null || !_parseslowfloat.write()) ? false : true;
    }

    public final boolean write() {
        return this.RatingCompat != null;
    }

    public final void IconCompatParcelizer(_handleUnrecognizedCharacterEscape p0) {
        MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody = this.RatingCompat;
        if (magicModuleSubmissionRequestBody == null) {
            throw new IllegalStateException("Invalid restart scope".toString());
        }
        magicModuleSubmissionRequestBody.invoke(p0, 1);
    }

    public final _includeScalar AudioAttributesCompatParcelizer(Object p0) {
        _includeScalar _includescalarAudioAttributesCompatParcelizer;
        _append _appendVar = this.AudioAttributesCompatParcelizer;
        return (_appendVar == null || (_includescalarAudioAttributesCompatParcelizer = _appendVar.AudioAttributesCompatParcelizer(this, p0)) == null) ? _includeScalar.RemoteActionCompatParcelizer : _includescalarAudioAttributesCompatParcelizer;
    }

    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        _append _appendVar = this.AudioAttributesCompatParcelizer;
        if (_appendVar != null) {
            _appendVar.RemoteActionCompatParcelizer(this);
        }
        this.AudioAttributesCompatParcelizer = null;
        this.onCommand = null;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
        this.RatingCompat = null;
    }

    public final void read(_append p0) {
        this.AudioAttributesCompatParcelizer = p0;
    }

    @Override // kotlin.escapesFor
    public final void AudioAttributesCompatParcelizer() {
        _append _appendVar = this.AudioAttributesCompatParcelizer;
        if (_appendVar != null) {
            _appendVar.AudioAttributesCompatParcelizer(this, null);
        }
    }

    @Override // kotlin.releaseNameCopyBuffer
    public final void read(MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p0) {
        this.RatingCompat = p0;
    }

    public final void AudioAttributesCompatParcelizer(int p0) {
        this.MediaBrowserCompatSearchResultReceiver = p0;
        MediaDescriptionCompat(false);
    }

    public final void onCommand() {
        if (MediaMetadataCompat()) {
            return;
        }
        MediaDescriptionCompat(true);
    }

    public final boolean IconCompatParcelizer(Object p0) {
        int i = 0;
        if (onAddQueueItem()) {
            return false;
        }
        AlertDialogLayout<Object> alertDialogLayout = this.onCommand;
        int i2 = 1;
        if (alertDialogLayout == null) {
            alertDialogLayout = new AlertDialogLayout<>(i, i2, null);
            this.onCommand = alertDialogLayout;
        }
        return alertDialogLayout.RemoteActionCompatParcelizer(p0, this.MediaBrowserCompatSearchResultReceiver, -1) == this.MediaBrowserCompatSearchResultReceiver;
    }

    public final void read(reportInvalidNumber<?> p0, Object p1) {
        setKeyListener<reportInvalidNumber<?>, Object> setkeylistener = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (setkeylistener == null) {
            setkeylistener = new setKeyListener<>(0, 1, null);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = setkeylistener;
        }
        setkeylistener.RemoteActionCompatParcelizer(p0, p1);
    }

    public final boolean MediaDescriptionCompat() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean write(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != 0) goto L8
            return r2
        L8:
            o.setKeyListener<o.reportInvalidNumber<?>, java.lang.Object> r3 = r0.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            if (r3 != 0) goto Ld
            return r2
        Ld:
            boolean r4 = r1 instanceof kotlin.reportInvalidNumber
            if (r4 == 0) goto L18
            o.reportInvalidNumber r1 = (kotlin.reportInvalidNumber) r1
            boolean r0 = r0.write(r1, r3)
            return r0
        L18:
            boolean r4 = r1 instanceof kotlin.setButtonDrawable
            if (r4 == 0) goto L72
            o.setButtonDrawable r1 = (kotlin.setButtonDrawable) r1
            boolean r4 = r1.AudioAttributesImplApi21Parcelizer()
            r5 = 0
            if (r4 == 0) goto L71
            java.lang.Object[] r4 = r1.write
            long[] r1 = r1.AudioAttributesCompatParcelizer
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L71
            r7 = r5
        L2f:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L6c
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r5
        L49:
            if (r12 >= r10) goto L6a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L66
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            boolean r14 = r13 instanceof kotlin.reportInvalidNumber
            if (r14 == 0) goto L65
            o.reportInvalidNumber r13 = (kotlin.reportInvalidNumber) r13
            boolean r13 = r0.write(r13, r3)
            if (r13 == 0) goto L66
        L65:
            return r2
        L66:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L49
        L6a:
            if (r10 != r11) goto L71
        L6c:
            if (r7 == r6) goto L71
            int r7 = r7 + 1
            goto L2f
        L71:
            return r5
        L72:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.rawReference.write(java.lang.Object):boolean");
    }

    private final boolean write(reportInvalidNumber<?> reportinvalidnumber, setKeyListener<reportInvalidNumber<?>, Object> setkeylistener) {
        toMagicModuleMetaRepoModel.read(reportinvalidnumber, "");
        quoteAsUTF8<?> quoteasutf8IconCompatParcelizer = reportinvalidnumber.IconCompatParcelizer();
        if (quoteasutf8IconCompatParcelizer == null) {
            quoteasutf8IconCompatParcelizer = _qbuf.RemoteActionCompatParcelizer();
        }
        return !quoteasutf8IconCompatParcelizer.IconCompatParcelizer(reportinvalidnumber.AudioAttributesCompatParcelizer().IconCompatParcelizer(), setkeylistener.AudioAttributesImplApi26Parcelizer(reportinvalidnumber));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleMediaPlayPauseIfPendingOnHandler() {
        /*
            r17 = this;
            r1 = r17
            o._append r0 = r1.AudioAttributesCompatParcelizer
            if (r0 == 0) goto L60
            o.AlertDialogLayout<java.lang.Object> r2 = r1.onCommand
            if (r2 == 0) goto L60
            r3 = 1
            r1.MediaBrowserCompatCustomActionResultReceiver(r3)
            r3 = 0
            o.setSupportBackgroundTintMode r2 = (kotlin.setSupportBackgroundTintMode) r2     // Catch: java.lang.Throwable -> L5b
            java.lang.Object[] r4 = r2.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> L5b
            int[] r5 = r2.AudioAttributesImplBaseParcelizer     // Catch: java.lang.Throwable -> L5b
            long[] r2 = r2.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> L5b
            int r6 = r2.length     // Catch: java.lang.Throwable -> L5b
            int r6 = r6 + (-2)
            if (r6 < 0) goto L57
            r7 = r3
        L1d:
            r8 = r2[r7]     // Catch: java.lang.Throwable -> L5b
            long r10 = ~r8     // Catch: java.lang.Throwable -> L5b
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L52
            int r10 = r7 - r6
            int r10 = ~r10     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r3
        L37:
            if (r12 >= r10) goto L50
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r4[r13]     // Catch: java.lang.Throwable -> L5b
            r13 = r5[r13]     // Catch: java.lang.Throwable -> L5b
            r0.IconCompatParcelizer(r14)     // Catch: java.lang.Throwable -> L5b
        L4c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L37
        L50:
            if (r10 != r11) goto L57
        L52:
            if (r7 == r6) goto L57
            int r7 = r7 + 1
            goto L1d
        L57:
            r1.MediaBrowserCompatCustomActionResultReceiver(r3)
            return
        L5b:
            r0 = move-exception
            r1.MediaBrowserCompatCustomActionResultReceiver(r3)
            throw r0
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.rawReference.handleMediaPlayPauseIfPendingOnHandler():void");
    }

    public final getAnswerMap<createChildArrayContext, getShowPopup> write(final int p0) {
        final AlertDialogLayout<Object> alertDialogLayout = this.onCommand;
        if (alertDialogLayout == null || RatingCompat()) {
            return null;
        }
        AlertDialogLayout<Object> alertDialogLayout2 = alertDialogLayout;
        Object[] objArr = alertDialogLayout2.AudioAttributesCompatParcelizer;
        int[] iArr = alertDialogLayout2.AudioAttributesImplBaseParcelizer;
        long[] jArr = alertDialogLayout2.RemoteActionCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        if (iArr[i4] != p0) {
                            return new getAnswerMap() { // from class: o.unknown
                                @Override // kotlin.getAnswerMap
                                public final Object invoke(Object obj2) {
                                    return rawReference.write(this.RemoteActionCompatParcelizer, p0, alertDialogLayout, (createChildArrayContext) obj2);
                                }
                            };
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return null;
                }
            }
            if (i == length) {
                return null;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.getShowPopup write(kotlin.rawReference r17, int r18, kotlin.AlertDialogLayout r19, kotlin.createChildArrayContext r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r0.MediaBrowserCompatSearchResultReceiver
            if (r4 != r1) goto L87
            o.AlertDialogLayout<java.lang.Object> r4 = r0.onCommand
            boolean r4 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r2, r4)
            if (r4 == 0) goto L87
            boolean r4 = r3 instanceof kotlin.getTokenLineNr
            if (r4 == 0) goto L87
            r4 = r2
            o.setSupportBackgroundTintMode r4 = (kotlin.setSupportBackgroundTintMode) r4
            long[] r4 = r4.RemoteActionCompatParcelizer
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L87
            r7 = 0
        L23:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L82
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L3d:
            if (r12 >= r10) goto L7f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L79
            int r13 = r7 << 3
            int r13 = r13 + r12
            java.lang.Object[] r14 = r2.AudioAttributesCompatParcelizer
            r14 = r14[r13]
            int[] r15 = r2.AudioAttributesImplBaseParcelizer
            r15 = r15[r13]
            if (r15 == r1) goto L57
            r15 = 1
            goto L58
        L57:
            r15 = 0
        L58:
            if (r15 == 0) goto L71
            r6 = r3
            o.getTokenLineNr r6 = (kotlin.getTokenLineNr) r6
            r6.read(r14, r0)
            boolean r11 = r14 instanceof kotlin.reportInvalidNumber
            if (r11 == 0) goto L71
            r11 = r14
            o.reportInvalidNumber r11 = (kotlin.reportInvalidNumber) r11
            r6.AudioAttributesCompatParcelizer(r11)
            o.setKeyListener<o.reportInvalidNumber<?>, java.lang.Object> r6 = r0.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            if (r6 == 0) goto L71
            r6.IconCompatParcelizer(r14)
        L71:
            if (r15 == 0) goto L76
            r2.read(r13)
        L76:
            r6 = 8
            goto L7a
        L79:
            r6 = r11
        L7a:
            long r8 = r8 >> r6
            int r12 = r12 + 1
            r11 = r6
            goto L3d
        L7f:
            r6 = r11
            if (r10 != r6) goto L87
        L82:
            if (r7 == r5) goto L87
            int r7 = r7 + 1
            goto L23
        L87:
            o.getShowPopup r0 = kotlin.getShowPopup.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.rawReference.write(o.rawReference, int, o.AlertDialogLayout, o.createChildArrayContext):o.getShowPopup");
    }

    /* JADX INFO: renamed from: o.rawReference$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/rawReference$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/setEncoding;", "p0", "", "Lo/_parseSlowFloat;", "p1", "Lo/_append;", "p2", "", "write", "(Lo/setEncoding;Ljava/util/List;Lo/_append;)V", "Lo/releaseTokenBuffer;", "", "RemoteActionCompatParcelizer", "(Lo/releaseTokenBuffer;Ljava/util/List;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final void write(setEncoding p0, List<_parseSlowFloat> p1, _append p2) {
            List<_parseSlowFloat> list = p1;
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object objAudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer(p1.get(i), 0);
                rawReference rawreference = objAudioAttributesCompatParcelizer instanceof rawReference ? (rawReference) objAudioAttributesCompatParcelizer : null;
                if (rawreference != null) {
                    rawreference.read(p2);
                }
            }
        }

        public final boolean RemoteActionCompatParcelizer(releaseTokenBuffer p0, List<_parseSlowFloat> p1) {
            List<_parseSlowFloat> list = p1;
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    _parseSlowFloat _parseslowfloat = p1.get(i);
                    if (p0.read(_parseslowfloat) && (p0.read(p0.IconCompatParcelizer(_parseslowfloat), 0) instanceof rawReference)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return (this.write & 1) != 0;
    }

    public final void AudioAttributesImplApi21Parcelizer(boolean z) {
        int i = this.write;
        this.write = z ? i | 1 : i & (-2);
    }

    public final boolean MediaMetadataCompat() {
        return (this.write & 128) != 0;
    }

    public final void AudioAttributesImplApi26Parcelizer(boolean z) {
        int i = this.write;
        this.write = z ? i | 128 : i & (-129);
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        return (this.write & 1024) != 0;
    }

    public final void AudioAttributesImplBaseParcelizer(boolean z) {
        int i = this.write;
        this.write = z ? i | 1024 : i & (-1025);
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return (this.write & 256) != 0;
    }

    public final void write(boolean z) {
        int i = this.write;
        this.write = z ? i | 256 : i & (-257);
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return (this.write & 512) != 0;
    }

    public final void MediaBrowserCompatItemReceiver(boolean z) {
        int i = this.write;
        this.write = z ? i | 512 : i & (-513);
    }

    public final boolean read() {
        return (this.write & 2) != 0;
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        int i = this.write;
        this.write = z ? i | 2 : i & (-3);
    }

    public final boolean RemoteActionCompatParcelizer() {
        return (this.write & 4) != 0;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        int i = this.write;
        this.write = z ? i | 4 : i & (-5);
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return (this.write & 8) != 0;
    }

    public final void read(boolean z) {
        int i = this.write;
        this.write = z ? i | 8 : i & (-9);
    }

    private final boolean onAddQueueItem() {
        return (this.write & 32) != 0;
    }

    private final void MediaBrowserCompatCustomActionResultReceiver(boolean z) {
        int i = this.write;
        this.write = z ? i | 32 : i & (-33);
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return (this.write & 64) != 0;
    }

    public final void IconCompatParcelizer(boolean z) {
        int i = this.write;
        this.write = z ? i | 64 : i & (-65);
    }

    public final boolean RatingCompat() {
        return (this.write & 16) != 0;
    }

    private final void MediaDescriptionCompat(boolean z) {
        int i = this.write;
        this.write = z ? i | 16 : i & (-17);
    }
}
