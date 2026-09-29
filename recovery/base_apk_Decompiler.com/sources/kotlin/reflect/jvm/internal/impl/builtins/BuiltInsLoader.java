package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ServiceLoader;
import kotlin.CourseConfigV2PracticalItems;
import kotlin.ImageUpload;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleUseCase;
import kotlin.RenewEligible;
import kotlin.RenewEligibleCompanion;
import kotlin.getCourseIdInt;
import kotlin.getCreatedOnDateMs;
import kotlin.getDocSideType;
import kotlin.getMini;
import kotlin.getRenewExpiresOn;
import kotlin.getTopSection;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
public interface BuiltInsLoader {
    public static final RemoteActionCompatParcelizer write = RemoteActionCompatParcelizer.IconCompatParcelizer;

    CourseConfigV2PracticalItems createPackageFragmentProvider(getMini getmini, getTopSection gettopsection, Iterable<? extends getDocSideType> iterable, ImageUpload imageUpload, getCourseIdInt getcourseidint, boolean z);

    public static final class RemoteActionCompatParcelizer {
        static final /* synthetic */ RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer();
        private static final RenewEligible<BuiltInsLoader> RemoteActionCompatParcelizer = getRenewExpiresOn.write(RenewEligibleCompanion.write, IconCompatParcelizer.IconCompatParcelizer);

        static final class IconCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<BuiltInsLoader> {
            public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();

            @Override // kotlin.getCreatedOnDateMs
            public final /* synthetic */ BuiltInsLoader invoke() {
                return AudioAttributesCompatParcelizer();
            }

            private static BuiltInsLoader AudioAttributesCompatParcelizer() {
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(BuiltInsLoader.class, BuiltInsLoader.class.getClassLoader());
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(serviceLoaderLoad, "");
                BuiltInsLoader builtInsLoader = (BuiltInsLoader) IntermediateLoginResponseBody.MediaMetadataCompat(serviceLoaderLoad);
                if (builtInsLoader != null) {
                    return builtInsLoader;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }

            IconCompatParcelizer() {
                super(0);
            }
        }

        private RemoteActionCompatParcelizer() {
        }

        public static BuiltInsLoader write() {
            return RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        }
    }
}
