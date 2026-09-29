package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/_handleOddName;", "Lo/onCreateView;", "p0", "read", "(Lo/_handleOddName;Lo/onCreateView;)Lo/_handleOddName;", "Lkotlin/Function1;", "", "AudioAttributesCompatParcelizer", "(Lo/_handleOddName;Lo/getAnswerMap;)Lo/_handleOddName;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class onCreateOptionsMenu {

    /* JADX INFO: renamed from: o.onCreateOptionsMenu$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "read", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        final /* synthetic */ getAnswerMap $RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            read(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void read(as asVar) {
            asVar.write("onConsumedWindowInsetsChanged");
            asVar.getIconCompatParcelizer().IconCompatParcelizer("block", this.$RemoteActionCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(getAnswerMap getanswermap) {
            super(1);
            this.$RemoteActionCompatParcelizer = getanswermap;
        }
    }

    /* JADX INFO: renamed from: o.onCreateOptionsMenu$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/as;", "", "IconCompatParcelizer", "(Lo/as;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<as, getShowPopup> {
        final /* synthetic */ onCreateView $AudioAttributesCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(as asVar) {
            IconCompatParcelizer(asVar);
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(as asVar) {
            asVar.write("windowInsetsPadding");
            asVar.getIconCompatParcelizer().IconCompatParcelizer("insets", this.$AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(onCreateView oncreateview) {
            super(1);
            this.$AudioAttributesCompatParcelizer = oncreateview;
        }
    }

    public static final _handleOddName read(_handleOddName _handleoddname, onCreateView oncreateview) {
        return _handleoddname.AudioAttributesCompatParcelizer(new getMinimumMaxLifecycleState(oncreateview, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass4(oncreateview) : C0214type.read()));
    }

    public static final _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, getAnswerMap<? super onCreateView, getShowPopup> getanswermap) {
        return _handleoddname.AudioAttributesCompatParcelizer(new BackStackRecordState(getanswermap, C0214type.AudioAttributesCompatParcelizer() ? new AnonymousClass1(getanswermap) : C0214type.read()));
    }
}
