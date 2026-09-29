package kotlin;

import java.util.List;
import kotlin.Metadata;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/getSubtitleView;", "Lo/withTypeHandler;", "<init>", "()V", "Lo/withContentValueHandler;", "", "Lo/isTypeOrSuperTypeOf;", "p0", "Lo/PropertyValueAny;", "p1", "Lo/withHandlersFrom;", "AudioAttributesCompatParcelizer", "(Lo/withContentValueHandler;Ljava/util/List;J)Lo/withHandlersFrom;", "Lkotlin/Function1;", "Lo/_parser$IconCompatParcelizer;", "", "write", "Lo/getAnswerMap;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getSubtitleView implements withTypeHandler {
    public static final getSubtitleView INSTANCE = new getSubtitleView();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static final getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> IconCompatParcelizer = new getAnswerMap() { // from class: o.lambdanew0androidxmedia3uiPlayerView
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return getSubtitleView.read((_parser.IconCompatParcelizer) obj);
        }
    };

    private getSubtitleView() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_parser.IconCompatParcelizer iconCompatParcelizer) {
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.withTypeHandler
    public final withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, List<? extends isTypeOrSuperTypeOf> list, long j) {
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, PropertyValueAny.AudioAttributesImplBaseParcelizer(j), PropertyValueAny.AudioAttributesImplApi21Parcelizer(j), null, IconCompatParcelizer, 4, null);
    }
}
