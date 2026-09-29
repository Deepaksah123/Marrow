package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin._assertNotNull;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/JsonMappingExceptionReference;", "Lo/_assertNotNull$AudioAttributesCompatParcelizer;", "<init>", "()V", "Lo/withContentValueHandler;", "", "Lo/isTypeOrSuperTypeOf;", "p0", "Lo/PropertyValueAny;", "p1", "Lo/withHandlersFrom;", "AudioAttributesCompatParcelizer", "(Lo/withContentValueHandler;Ljava/util/List;J)Lo/withHandlersFrom;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JsonMappingExceptionReference extends _assertNotNull.AudioAttributesCompatParcelizer {
    public static final JsonMappingExceptionReference INSTANCE = new JsonMappingExceptionReference();

    private JsonMappingExceptionReference() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // kotlin.withTypeHandler
    public final withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, List<? extends isTypeOrSuperTypeOf> list, long j) {
        int size = list.size();
        if (size == 0) {
            return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, PropertyValueAny.MediaBrowserCompatItemReceiver(j), PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j), null, AnonymousClass4.write, 4, null);
        }
        if (size == 1) {
            _parser _parserVarWrite = list.get(0).write(j);
            return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, PropertyValueBuffer.IconCompatParcelizer(j, _parserVarWrite.getRead()), PropertyValueBuffer.RemoteActionCompatParcelizer(j, _parserVarWrite.getRemoteActionCompatParcelizer()), null, new AnonymousClass2(_parserVarWrite), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size2; i++) {
            _parser _parserVarWrite2 = list.get(i).write(j);
            iMax = Math.max(_parserVarWrite2.getRead(), iMax);
            iMax2 = Math.max(_parserVarWrite2.getRemoteActionCompatParcelizer(), iMax2);
            arrayList.add(_parserVarWrite2);
        }
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, PropertyValueBuffer.IconCompatParcelizer(j, iMax), PropertyValueBuffer.RemoteActionCompatParcelizer(j, iMax2), null, new AnonymousClass1(arrayList), 4, null);
    }

    /* JADX INFO: renamed from: o.JsonMappingExceptionReference$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "IconCompatParcelizer", "(Lo/_parser$IconCompatParcelizer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> {
        public static final AnonymousClass4 write = new AnonymousClass4();

        public final void IconCompatParcelizer(_parser.IconCompatParcelizer iconCompatParcelizer) {
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(_parser.IconCompatParcelizer iconCompatParcelizer) {
            IconCompatParcelizer(iconCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        AnonymousClass4() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.JsonMappingExceptionReference$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "read", "(Lo/_parser$IconCompatParcelizer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> {
        final /* synthetic */ _parser $RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(_parser.IconCompatParcelizer iconCompatParcelizer) {
            read(iconCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        public final void read(_parser.IconCompatParcelizer iconCompatParcelizer) {
            _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, this.$RemoteActionCompatParcelizer, 0, 0, BitmapDescriptorFactory.HUE_RED, null, 12, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(_parser _parserVar) {
            super(1);
            this.$RemoteActionCompatParcelizer = _parserVar;
        }
    }

    /* JADX INFO: renamed from: o.JsonMappingExceptionReference$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "write", "(Lo/_parser$IconCompatParcelizer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> {
        final /* synthetic */ List<_parser> $IconCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(_parser.IconCompatParcelizer iconCompatParcelizer) {
            write(iconCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        public final void write(_parser.IconCompatParcelizer iconCompatParcelizer) {
            List<_parser> list = this.$IconCompatParcelizer;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, list.get(i), 0, 0, BitmapDescriptorFactory.HUE_RED, null, 12, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(List<? extends _parser> list) {
            super(1);
            this.$IconCompatParcelizer = list;
        }
    }
}
