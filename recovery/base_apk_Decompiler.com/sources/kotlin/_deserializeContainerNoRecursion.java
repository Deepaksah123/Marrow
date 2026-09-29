package kotlin;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0005J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0005R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\f\u0010\u0019R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001c"}, d2 = {"Lo/_deserializeContainerNoRecursion;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/_reportTooManyCollisions;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "<init>", "()V", "Lo/makeChild;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/makeChild;)V", "Lo/_handleSpillOverflow;", "write", "()Lo/_handleSpillOverflow;", "Landroid/view/View;", "p1", "onGlobalFocusChanged", "(Landroid/view/View;Landroid/view/View;)V", "c_", "MediaDescriptionCompat", "AudioAttributesCompatParcelizer", "Landroid/view/View;", "read", "()Landroid/view/View;", "Landroid/view/ViewTreeObserver;", "Landroid/view/ViewTreeObserver;", "Lkotlin/Function1;", "Lo/_appendLongName;", "Lo/getAnswerMap;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class _deserializeContainerNoRecursion extends _handleOddName.IconCompatParcelizer implements _reportTooManyCollisions, ViewTreeObserver.OnGlobalFocusChangeListener {
    private View AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public ViewTreeObserver RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getAnswerMap<_appendLongName, getShowPopup> write = new AnonymousClass1();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<_appendLongName, getShowPopup> IconCompatParcelizer = new AnonymousClass3();

    /* JADX INFO: renamed from: read, reason: from getter */
    public final View getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: o._deserializeContainerNoRecursion$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_appendLongName;", "", "read", "(Lo/_appendLongName;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<_appendLongName, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(_appendLongName _appendlongname) {
            read(_appendlongname);
            return getShowPopup.INSTANCE;
        }

        public final void read(_appendLongName _appendlongname) {
            View viewRemoteActionCompatParcelizer = _createWithMerge.RemoteActionCompatParcelizer(_deserializeContainerNoRecursion.this);
            if (viewRemoteActionCompatParcelizer.isFocused() || viewRemoteActionCompatParcelizer.hasFocus()) {
                return;
            }
            if (_findSecondary.AudioAttributesCompatParcelizer(viewRemoteActionCompatParcelizer, _findSecondary.write(_appendlongname.getAudioAttributesCompatParcelizer()), _createWithMerge.IconCompatParcelizer(collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(_deserializeContainerNoRecursion.this).getOnPlayFromSearch(), C0217version.RemoteActionCompatParcelizer(_deserializeContainerNoRecursion.this), viewRemoteActionCompatParcelizer))) {
                return;
            }
            _appendlongname.read();
        }

        AnonymousClass1() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o._deserializeContainerNoRecursion$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_appendLongName;", "", "write", "(Lo/_appendLongName;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<_appendLongName, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(_appendLongName _appendlongname) {
            write(_appendlongname);
            return getShowPopup.INSTANCE;
        }

        public final void write(_appendLongName _appendlongname) {
            View viewFindNextFocusFromRect;
            View viewRemoteActionCompatParcelizer = _createWithMerge.RemoteActionCompatParcelizer(_deserializeContainerNoRecursion.this);
            if (_verifyNoLeadingZeroes.RemoteActionCompatParcelizer) {
                if (viewRemoteActionCompatParcelizer.hasFocus() || viewRemoteActionCompatParcelizer.isFocused()) {
                    viewRemoteActionCompatParcelizer.clearFocus();
                    return;
                }
                return;
            }
            if (_verifyNoLeadingZeroes.read || !viewRemoteActionCompatParcelizer.hasFocus()) {
                return;
            }
            nukeSymbols onPlayFromSearch = collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(_deserializeContainerNoRecursion.this).getOnPlayFromSearch();
            View viewRemoteActionCompatParcelizer2 = C0217version.RemoteActionCompatParcelizer(_deserializeContainerNoRecursion.this);
            if (viewRemoteActionCompatParcelizer instanceof ViewGroup) {
                Rect rectIconCompatParcelizer = _createWithMerge.IconCompatParcelizer(onPlayFromSearch, viewRemoteActionCompatParcelizer2, viewRemoteActionCompatParcelizer);
                Integer numWrite = _findSecondary.write(_appendlongname.getAudioAttributesCompatParcelizer());
                int iIntValue = numWrite != null ? numWrite.intValue() : TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
                FocusFinder focusFinder = FocusFinder.getInstance();
                _deserializeContainerNoRecursion _deserializecontainernorecursion = _deserializeContainerNoRecursion.this;
                if (_deserializecontainernorecursion.getAudioAttributesCompatParcelizer() != null) {
                    toMagicModuleMetaRepoModel.read(viewRemoteActionCompatParcelizer2, "");
                    viewFindNextFocusFromRect = focusFinder.findNextFocus((ViewGroup) viewRemoteActionCompatParcelizer2, _deserializecontainernorecursion.getAudioAttributesCompatParcelizer(), iIntValue);
                } else {
                    toMagicModuleMetaRepoModel.read(viewRemoteActionCompatParcelizer2, "");
                    viewFindNextFocusFromRect = focusFinder.findNextFocusFromRect((ViewGroup) viewRemoteActionCompatParcelizer2, rectIconCompatParcelizer, iIntValue);
                }
                if (viewFindNextFocusFromRect != null && _createWithMerge.AudioAttributesCompatParcelizer(viewRemoteActionCompatParcelizer, viewFindNextFocusFromRect)) {
                    viewFindNextFocusFromRect.requestFocus(iIntValue, rectIconCompatParcelizer);
                    _appendlongname.read();
                    return;
                } else {
                    if (!viewRemoteActionCompatParcelizer2.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus".toString());
                    }
                    return;
                }
            }
            if (!viewRemoteActionCompatParcelizer2.requestFocus()) {
                throw new IllegalStateException("host view did not take focus".toString());
            }
        }

        AnonymousClass3() {
            super(1);
        }
    }

    @Override // kotlin._reportTooManyCollisions
    public final void RemoteActionCompatParcelizer(makeChild p0) {
        p0.read(false);
        p0.RemoteActionCompatParcelizer(this.write);
        p0.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
    }

    private final _handleSpillOverflow write() {
        _deserializeContainerNoRecursion _deserializecontainernorecursion = this;
        int iWrite = _bind.write(1024);
        if (!_deserializecontainernorecursion.getRead().getRatingCompat()) {
            reportWrongTokenException.read("visitLocalDescendants called on an unattached node");
        }
        _handleOddName.IconCompatParcelizer read = _deserializecontainernorecursion.getRead();
        if ((read.getRemoteActionCompatParcelizer() & iWrite) != 0) {
            boolean z = false;
            for (_handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer = read.getAudioAttributesImplBaseParcelizer(); audioAttributesImplBaseParcelizer != null; audioAttributesImplBaseParcelizer = audioAttributesImplBaseParcelizer.getAudioAttributesImplBaseParcelizer()) {
                if ((audioAttributesImplBaseParcelizer.getWrite() & iWrite) != 0) {
                    _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = audioAttributesImplBaseParcelizer;
                    UTF32Reader uTF32Reader = null;
                    while (iconCompatParcelizerWrite != null) {
                        if (iconCompatParcelizerWrite instanceof _handleSpillOverflow) {
                            _handleSpillOverflow _handlespilloverflow = (_handleSpillOverflow) iconCompatParcelizerWrite;
                            if (z) {
                                return _handlespilloverflow;
                            }
                            z = true;
                        } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                            int i = 0;
                            for (_handleOddName.IconCompatParcelizer iconCompatParcelizer = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer(); iconCompatParcelizer != null; iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer()) {
                                if ((iconCompatParcelizer.getWrite() & iWrite) != 0) {
                                    i++;
                                    if (i == 1) {
                                        iconCompatParcelizerWrite = iconCompatParcelizer;
                                    } else {
                                        if (uTF32Reader == null) {
                                            uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                        }
                                        if (iconCompatParcelizerWrite != null) {
                                            if (uTF32Reader != null) {
                                                uTF32Reader.read(iconCompatParcelizerWrite);
                                            }
                                            iconCompatParcelizerWrite = null;
                                        }
                                        if (uTF32Reader != null) {
                                            uTF32Reader.read(iconCompatParcelizer);
                                        }
                                    }
                                }
                            }
                            if (i != 1) {
                            }
                        }
                        iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper".toString());
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View p0, View p1) {
        _deserializeContainerNoRecursion _deserializecontainernorecursion = this;
        if (collectLongDefaults.AudioAttributesImplApi26Parcelizer(_deserializecontainernorecursion).getOnMediaButtonEvent() != null) {
            View viewRemoteActionCompatParcelizer = _createWithMerge.RemoteActionCompatParcelizer(this);
            nukeSymbols onPlayFromSearch = collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(_deserializecontainernorecursion).getOnPlayFromSearch();
            _configureGenerator _configuregeneratorMediaBrowserCompatCustomActionResultReceiver = collectLongDefaults.MediaBrowserCompatCustomActionResultReceiver(_deserializecontainernorecursion);
            boolean z = (p0 == null || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, _configuregeneratorMediaBrowserCompatCustomActionResultReceiver) || !_createWithMerge.AudioAttributesCompatParcelizer(viewRemoteActionCompatParcelizer, p0)) ? false : true;
            boolean z2 = (p1 == null || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p1, _configuregeneratorMediaBrowserCompatCustomActionResultReceiver) || !_createWithMerge.AudioAttributesCompatParcelizer(viewRemoteActionCompatParcelizer, p1)) ? false : true;
            if (z && z2) {
                this.AudioAttributesCompatParcelizer = p1;
                return;
            }
            if (z2) {
                this.AudioAttributesCompatParcelizer = p1;
                _handleSpillOverflow _handlespilloverflowWrite = write();
                if (_handlespilloverflowWrite.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer()) {
                    return;
                }
                copyArrays.AudioAttributesCompatParcelizer(_handlespilloverflowWrite);
                return;
            }
            if (z) {
                this.AudioAttributesCompatParcelizer = null;
                if (write().AudioAttributesCompatParcelizer().write()) {
                    onPlayFromSearch.read(false, true, false, _checkNeedForRehash.INSTANCE.AudioAttributesCompatParcelizer());
                    return;
                }
                return;
            }
            this.AudioAttributesCompatParcelizer = null;
        }
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void c_() {
        super.c_();
        ViewTreeObserver viewTreeObserver = C0217version.RemoteActionCompatParcelizer(this).getViewTreeObserver();
        this.RemoteActionCompatParcelizer = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void MediaDescriptionCompat() {
        ViewTreeObserver viewTreeObserver = this.RemoteActionCompatParcelizer;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.RemoteActionCompatParcelizer = null;
        C0217version.RemoteActionCompatParcelizer(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.AudioAttributesCompatParcelizer = null;
        super.MediaDescriptionCompat();
    }
}
