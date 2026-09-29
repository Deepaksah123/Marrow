package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0002\u001a;\u0010\u0001\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0005H\u0002¢\u0006\u0004\b\u0001\u0010\f"}, d2 = {"Lo/_handleOddName;", "write", "(Lo/_handleOddName;)Lo/_handleOddName;", "IconCompatParcelizer", "read", "Lkotlin/Function1;", "Lo/as;", "", "p0", "Lo/onCreateContextMenu;", "Lo/onCreateView;", "p1", "(Lo/_handleOddName;Lo/getAnswerMap;Lo/getAnswerMap;)Lo/_handleOddName;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class onInflate {
    /* JADX INFO: Access modifiers changed from: private */
    public static final onCreateView AudioAttributesImplBaseParcelizer(onCreateContextMenu oncreatecontextmenu) {
        return oncreatecontextmenu.getAudioAttributesImplBaseParcelizer();
    }

    /* JADX INFO: renamed from: o.onInflate$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "RemoteActionCompatParcelizer", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            RemoteActionCompatParcelizer(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void RemoteActionCompatParcelizer(as asVar) {
            asVar.write("navigationBarsPadding");
        }

        public AnonymousClass2() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.onInflate$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "write", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            write(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void write(as asVar) {
            asVar.write("statusBarsPadding");
        }

        public AnonymousClass3() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.onInflate$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "write", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            write(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void write(as asVar) {
            asVar.write("systemBarsPadding");
        }

        public AnonymousClass4() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final onCreateView IconCompatParcelizer(onCreateContextMenu oncreatecontextmenu) {
        return oncreatecontextmenu.getAudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final onCreateView RemoteActionCompatParcelizer(onCreateContextMenu oncreatecontextmenu) {
        return oncreatecontextmenu.getRead();
    }

    private static final _handleOddName write(_handleOddName _handleoddname, getAnswerMap<? super as, getShowPopup> getanswermap, getAnswerMap<? super onCreateContextMenu, ? extends onCreateView> getanswermap2) {
        return _handleoddname.AudioAttributesCompatParcelizer(new isResumed(getanswermap, getanswermap2));
    }

    public static final _handleOddName write(_handleOddName _handleoddname) {
        return write(_handleoddname, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass4() : C0214type.read(), new getAnswerMap() { // from class: o.onDestroyOptionsMenu
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return onInflate.AudioAttributesImplBaseParcelizer((onCreateContextMenu) obj);
            }
        });
    }

    public static final _handleOddName IconCompatParcelizer(_handleOddName _handleoddname) {
        return write(_handleoddname, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass3() : C0214type.read(), new getAnswerMap() { // from class: o.onLowMemory
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return onInflate.IconCompatParcelizer((onCreateContextMenu) obj);
            }
        });
    }

    public static final _handleOddName read(_handleOddName _handleoddname) {
        return write(_handleoddname, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass2() : C0214type.read(), new getAnswerMap() { // from class: o.onHiddenChanged
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return onInflate.RemoteActionCompatParcelizer((onCreateContextMenu) obj);
            }
        });
    }
}
