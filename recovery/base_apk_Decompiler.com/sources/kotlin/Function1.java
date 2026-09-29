package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.switchToNext;

/* JADX INFO: renamed from: o.AppCompatSpinner, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\",\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"-\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0000*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\b\u0010\t"}, d2 = {"Lkotlin/Function1;", "Lo/findImplicitPropertyName;", "Lo/evictionCount;", "Lo/switchToNext;", "Lo/setAppSearchData;", "IconCompatParcelizer", "Lo/getAnswerMap;", "Lo/switchToNext$AudioAttributesCompatParcelizer;", "write", "(Lo/switchToNext$AudioAttributesCompatParcelizer;)Lo/getAnswerMap;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class Function1 {
    private static final getAnswerMap<findImplicitPropertyName, evictionCount<switchToNext, setAppSearchData>> IconCompatParcelizer = AnonymousClass3.write;

    /* JADX INFO: renamed from: o.AppCompatSpinner$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/findImplicitPropertyName;", "p0", "Lo/evictionCount;", "Lo/switchToNext;", "Lo/setAppSearchData;", "read", "(Lo/findImplicitPropertyName;)Lo/evictionCount;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<findImplicitPropertyName, evictionCount<switchToNext, setAppSearchData>> {
        public static final AnonymousClass3 write = new AnonymousClass3();

        /* JADX INFO: renamed from: o.AppCompatSpinner$3$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/setAppSearchData;", "p0", "Lo/switchToNext;", "write", "(Lo/setAppSearchData;)J"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<setAppSearchData, switchToNext> {
            final /* synthetic */ findImplicitPropertyName $write;

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ switchToNext invoke(setAppSearchData setappsearchdata) {
                return switchToNext.write(write(setappsearchdata));
            }

            public final long write(setAppSearchData setappsearchdata) {
                float remoteActionCompatParcelizer = setappsearchdata.getRemoteActionCompatParcelizer();
                float f = BitmapDescriptorFactory.HUE_RED;
                if (remoteActionCompatParcelizer < BitmapDescriptorFactory.HUE_RED) {
                    remoteActionCompatParcelizer = 0.0f;
                }
                if (remoteActionCompatParcelizer > 1.0f) {
                    remoteActionCompatParcelizer = 1.0f;
                }
                float read = setappsearchdata.getRead();
                if (read < -0.5f) {
                    read = -0.5f;
                }
                if (read > 0.5f) {
                    read = 0.5f;
                }
                float audioAttributesCompatParcelizer = setappsearchdata.getAudioAttributesCompatParcelizer();
                float f2 = audioAttributesCompatParcelizer >= -0.5f ? audioAttributesCompatParcelizer : -0.5f;
                float f3 = f2 <= 0.5f ? f2 : 0.5f;
                float write = setappsearchdata.getWrite();
                if (write >= BitmapDescriptorFactory.HUE_RED) {
                    f = write;
                }
                return switchToNext.write(RequestPayload.write(remoteActionCompatParcelizer, read, f3, f <= 1.0f ? f : 1.0f, findFilterId.INSTANCE.onCustomAction()), this.$write);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(findImplicitPropertyName findimplicitpropertyname) {
                super(1);
                this.$write = findimplicitpropertyname;
            }
        }

        /* JADX INFO: renamed from: o.AppCompatSpinner$3$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/switchToNext;", "p0", "Lo/setAppSearchData;", "IconCompatParcelizer", "(J)Lo/setAppSearchData;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<switchToNext, setAppSearchData> {
            public static final AnonymousClass4 read = new AnonymousClass4();

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ setAppSearchData invoke(switchToNext switchtonext) {
                return IconCompatParcelizer(switchtonext.getIconCompatParcelizer());
            }

            public final setAppSearchData IconCompatParcelizer(long j) {
                long jWrite = switchToNext.write(j, findFilterId.INSTANCE.onCustomAction());
                return new setAppSearchData(switchToNext.RemoteActionCompatParcelizer(jWrite), switchToNext.AudioAttributesImplApi21Parcelizer(jWrite), switchToNext.AudioAttributesImplBaseParcelizer(jWrite), switchToNext.IconCompatParcelizer(jWrite));
            }

            AnonymousClass4() {
                super(1);
            }
        }

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final evictionCount<switchToNext, setAppSearchData> invoke(findImplicitPropertyName findimplicitpropertyname) {
            return hitCount.write(AnonymousClass4.read, new AnonymousClass1(findimplicitpropertyname));
        }

        AnonymousClass3() {
            super(1);
        }
    }

    public static final getAnswerMap<findImplicitPropertyName, evictionCount<switchToNext, setAppSearchData>> write(switchToNext.Companion companion) {
        return IconCompatParcelizer;
    }
}
