package in.juspay.hypersdk.ota;

import in.juspay.hypersdk.core.PaymentConstants;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.C0177getRfBanners;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.SdkPayloadData;
import kotlin.StateResult;
import kotlin.TestGroupLSModel;
import kotlin.getCurrentAnsweredMcqProgress;
import kotlin.markCompletelambda1;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0080\b\u0018\u0000 %2\u00020\u0001:\u0006%&'()*B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\rR\u001a\u0010\"\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000f"}, d2 = {"Lin/juspay/hypersdk/ota/ReleaseConfig;", "", "Lin/juspay/hypersdk/ota/ReleaseConfig$Config;", "p0", "Lin/juspay/hypersdk/ota/ReleaseConfig$PackageManifest;", "p1", "Lin/juspay/hypersdk/ota/ReleaseConfig$ResourceManifest;", "p2", "<init>", "(Lin/juspay/hypersdk/ota/ReleaseConfig$Config;Lin/juspay/hypersdk/ota/ReleaseConfig$PackageManifest;Lin/juspay/hypersdk/ota/ReleaseConfig$ResourceManifest;)V", "component1", "()Lin/juspay/hypersdk/ota/ReleaseConfig$Config;", "component2", "()Lin/juspay/hypersdk/ota/ReleaseConfig$PackageManifest;", "component3", "()Lin/juspay/hypersdk/ota/ReleaseConfig$ResourceManifest;", "copy", "(Lin/juspay/hypersdk/ota/ReleaseConfig$Config;Lin/juspay/hypersdk/ota/ReleaseConfig$PackageManifest;Lin/juspay/hypersdk/ota/ReleaseConfig$ResourceManifest;)Lin/juspay/hypersdk/ota/ReleaseConfig;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "serialize", "()Ljava/lang/String;", "toString", PaymentConstants.Category.CONFIG, "Lin/juspay/hypersdk/ota/ReleaseConfig$Config;", "getConfig", "pkg", "Lin/juspay/hypersdk/ota/ReleaseConfig$PackageManifest;", "getPkg", Constants.RESOURCES_DIR_NAME, "Lin/juspay/hypersdk/ota/ReleaseConfig$ResourceManifest;", "getResources", "Companion", "Config", "PackageManifest", "Resource", "ResourceManifest", "Split"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ReleaseConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Config config;
    private final PackageManifest pkg;
    private final ResourceManifest resources;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0005\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0005\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\rJ\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\n2\u0006\u0010\u0005\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001e\u001a\u00020\u001d*\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001e\u001a\u00020\u001d*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010 \u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lin/juspay/hypersdk/ota/ReleaseConfig$Companion;", "", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "Lin/juspay/hypersdk/ota/ReleaseConfig$Config;", "configFromJSON", "(Lorg/json/JSONObject;)Lin/juspay/hypersdk/ota/ReleaseConfig$Config;", "", "Lo/getRfBanners;", "Lin/juspay/hypersdk/ota/ReleaseConfig;", "deSerialize-IoAF18A", "(Ljava/lang/String;)Ljava/lang/Object;", "deSerialize", "deSerializeConfig-IoAF18A", "deSerializeConfig", "Lin/juspay/hypersdk/ota/ReleaseConfig$PackageManifest;", "deSerializePackage-IoAF18A", "deSerializePackage", "Lin/juspay/hypersdk/ota/ReleaseConfig$ResourceManifest;", "deSerializeResources-IoAF18A", "deSerializeResources", "packageFromJSON", "(Lorg/json/JSONObject;)Lin/juspay/hypersdk/ota/ReleaseConfig$PackageManifest;", "resourcesFromJSON", "(Lorg/json/JSONObject;)Lin/juspay/hypersdk/ota/ReleaseConfig$ResourceManifest;", "Lorg/json/JSONArray;", "", "Ljava/net/URL;", "getURL", "(Lorg/json/JSONArray;I)Ljava/net/URL;", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/net/URL;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final URL getURL(JSONObject jSONObject, String str) throws JSONException {
            try {
                return new URL(jSONObject.getString(str));
            } catch (MalformedURLException unused) {
                StringBuilder sb = new StringBuilder("Property '");
                sb.append(str);
                sb.append("' is not a valid URL.");
                throw new JSONException(sb.toString());
            }
        }

        private final PackageManifest packageFromJSON(JSONObject p0) throws JSONException {
            String string = p0.getString("name");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            String string2 = p0.getString("version");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            JSONObject jSONObject = p0.getJSONObject("properties");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObject, "");
            Split split = new Split(getURL(p0, "index"));
            JSONArray jSONArray = p0.getJSONArray("splits");
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                Companion companion = ReleaseConfig.INSTANCE;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONArray, "");
                arrayList.add(new Split(companion.getURL(jSONArray, i)));
            }
            return new PackageManifest(string, string2, jSONObject, split, arrayList);
        }

        /* JADX INFO: renamed from: deSerialize-IoAF18A, reason: not valid java name */
        public final Object m355deSerializeIoAF18A(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            try {
                JSONObject jSONObject = new JSONObject(p0);
                JSONObject jSONObject2 = jSONObject.getJSONObject(PaymentConstants.Category.CONFIG);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObject2, "");
                Config configConfigFromJSON = configFromJSON(jSONObject2);
                JSONObject jSONObject3 = jSONObject.getJSONObject(Constants.PACKAGE_DIR_NAME);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObject3, "");
                PackageManifest packageManifestPackageFromJSON = packageFromJSON(jSONObject3);
                JSONObject jSONObject4 = jSONObject.getJSONObject(Constants.RESOURCES_DIR_NAME);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObject4, "");
                ReleaseConfig releaseConfig = new ReleaseConfig(configConfigFromJSON, packageManifestPackageFromJSON, resourcesFromJSON(jSONObject4));
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                return C0177getRfBanners.read(releaseConfig);
            } catch (JSONException e) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
                return C0177getRfBanners.read(SdkPayloadData.write(e));
            }
        }

        /* JADX INFO: renamed from: deSerializeConfig-IoAF18A, reason: not valid java name */
        public final Object m356deSerializeConfigIoAF18A(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            try {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                return C0177getRfBanners.read(configFromJSON(new JSONObject(p0)));
            } catch (JSONException e) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
                return C0177getRfBanners.read(SdkPayloadData.write(e));
            }
        }

        /* JADX INFO: renamed from: deSerializePackage-IoAF18A, reason: not valid java name */
        public final Object m357deSerializePackageIoAF18A(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            try {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                return C0177getRfBanners.read(packageFromJSON(new JSONObject(p0)));
            } catch (JSONException e) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
                return C0177getRfBanners.read(SdkPayloadData.write(e));
            }
        }

        /* JADX INFO: renamed from: deSerializeResources-IoAF18A, reason: not valid java name */
        public final Object m358deSerializeResourcesIoAF18A(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            try {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                return C0177getRfBanners.read(resourcesFromJSON(new JSONObject(p0)));
            } catch (JSONException e) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
                return C0177getRfBanners.read(SdkPayloadData.write(e));
            }
        }

        public final ResourceManifest resourcesFromJSON(JSONObject p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Iterator<String> itKeys = p0.keys();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(itKeys, "");
            return new ResourceManifest(StateResult.MediaBrowserCompatItemReceiver(StateResult.write(StateResult.read((Iterator) itKeys), new ReleaseConfig$Companion$resourcesFromJSON$entries$1(p0))));
        }

        private Companion() {
        }

        private final Config configFromJSON(JSONObject p0) throws JSONException {
            String string = p0.getString("version");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            long j = p0.getLong("release_config_timeout");
            long j2 = p0.getLong("package_timeout");
            JSONObject jSONObject = p0.getJSONObject("properties");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObject, "");
            return new Config(string, j, j2, jSONObject);
        }

        private final URL getURL(JSONArray jSONArray, int i) throws JSONException {
            try {
                return new URL(jSONArray.getString(i));
            } catch (MalformedURLException unused) {
                StringBuilder sb = new StringBuilder("Value at index '");
                sb.append(i);
                sb.append("' is not a valid URL.");
                throw new JSONException(sb.toString());
            }
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0003¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\f\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0013H\u0096\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0096\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#2\u0006\u0010\u0003\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b$\u0010&J&\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b(\u0010)J\r\u0010+\u001a\u00020*¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b-\u0010.R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u00020\u00138\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b1\u0010\u001a"}, d2 = {"Lin/juspay/hypersdk/ota/ReleaseConfig$ResourceManifest;", "", "Lin/juspay/hypersdk/ota/ReleaseConfig$Resource;", "p0", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "", "contains", "(Lin/juspay/hypersdk/ota/ReleaseConfig$Resource;)Z", "", "containsAll", "(Ljava/util/Collection;)Z", "copy", "(Ljava/util/List;)Lin/juspay/hypersdk/ota/ReleaseConfig$ResourceManifest;", "", "equals", "(Ljava/lang/Object;)Z", "", "get", "(I)Lin/juspay/hypersdk/ota/ReleaseConfig$Resource;", "", "getResource", "(Ljava/lang/String;)Lin/juspay/hypersdk/ota/ReleaseConfig$Resource;", "hashCode", "()I", "indexOf", "(Lin/juspay/hypersdk/ota/ReleaseConfig$Resource;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "p1", "subList", "(II)Ljava/util/List;", "Lorg/json/JSONObject;", "toJSON", "()Lorg/json/JSONObject;", "toString", "()Ljava/lang/String;", "entries", "Ljava/util/List;", "getSize", "size"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ResourceManifest implements List<Resource>, getCurrentAnsweredMcqProgress {
        private final List<Resource> entries;

        public ResourceManifest(List<Resource> list) {
            toMagicModuleMetaRepoModel.write(list, "");
            this.entries = list;
        }

        /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
        public final void add2(int i, Resource resource) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends Resource> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean contains(Resource p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return this.entries.contains(p0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.List
        public final Resource get(int p0) {
            return this.entries.get(p0);
        }

        public final Resource getResource(String p0) {
            Object next;
            toMagicModuleMetaRepoModel.write(p0, "");
            Iterator<T> it = this.entries.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((Resource) next).getName(), (Object) p0)) {
                    break;
                }
            }
            return (Resource) next;
        }

        public final int indexOf(Resource p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return this.entries.indexOf(p0);
        }

        public final int lastIndexOf(Resource p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return this.entries.lastIndexOf(p0);
        }

        @Override // java.util.List
        public final ListIterator<Resource> listIterator() {
            return this.entries.listIterator();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.List
        public final Resource remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
        public final Resource set2(int i, Resource resource) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return getSize();
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return markCompletelambda1.read(this);
        }

        public final JSONObject toJSON() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            for (Resource resource : this.entries) {
                jSONObject.put(resource.getName(), resource.toJSON());
            }
            return jSONObject;
        }

        @Override // java.util.List
        public final /* synthetic */ void add(int i, Resource resource) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends Resource> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Resource) {
                return contains((Resource) obj);
            }
            return false;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Resource) {
                return indexOf((Resource) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Resource) {
                return lastIndexOf((Resource) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator<Resource> listIterator(int p0) {
            return this.entries.listIterator(p0);
        }

        @Override // java.util.List
        public final /* synthetic */ Resource remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* synthetic */ Resource set(int i, Resource resource) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            toMagicModuleMetaRepoModel.write(tArr, "");
            return (T[]) markCompletelambda1.RemoteActionCompatParcelizer(this, tArr);
        }

        public final boolean add(Resource resource) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        private final List<Resource> component1() {
            return this.entries;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ResourceManifest copy$default(ResourceManifest resourceManifest, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = resourceManifest.entries;
            }
            return resourceManifest.copy(list);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return this.entries.containsAll(p0);
        }

        public final ResourceManifest copy(List<Resource> p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new ResourceManifest(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof ResourceManifest) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.entries, ((ResourceManifest) p0).entries);
        }

        public final int getSize() {
            return this.entries.size();
        }

        @Override // java.util.List, java.util.Collection
        public final int hashCode() {
            return this.entries.hashCode();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.entries.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<Resource> iterator() {
            return this.entries.iterator();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void replaceAll(UnaryOperator<Resource> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void sort(Comparator<? super Resource> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final List<Resource> subList(int p0, int p1) {
            return this.entries.subList(p0, p1);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ResourceManifest(entries=");
            sb.append(this.entries);
            sb.append(')');
            return sb.toString();
        }
    }

    public ReleaseConfig(Config config, PackageManifest packageManifest, ResourceManifest resourceManifest) {
        toMagicModuleMetaRepoModel.write(config, "");
        toMagicModuleMetaRepoModel.write(packageManifest, "");
        toMagicModuleMetaRepoModel.write(resourceManifest, "");
        this.config = config;
        this.pkg = packageManifest;
        this.resources = resourceManifest;
    }

    public final Config getConfig() {
        return this.config;
    }

    public final PackageManifest getPkg() {
        return this.pkg;
    }

    public final ResourceManifest getResources() {
        return this.resources;
    }

    public final String serialize() {
        String string = new JSONObject().put(PaymentConstants.Category.CONFIG, this.config.toJSON()).put(Constants.PACKAGE_DIR_NAME, this.pkg.toJSON()).put(Constants.RESOURCES_DIR_NAME, this.resources.toJSON()).toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u0011J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u001c\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u001f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0011R\u001a\u0010\"\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u000eR\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\f"}, d2 = {"Lin/juspay/hypersdk/ota/ReleaseConfig$Config;", "", "", "p0", "", "p1", "p2", "Lorg/json/JSONObject;", "p3", "<init>", "(Ljava/lang/String;JJLorg/json/JSONObject;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "()Lorg/json/JSONObject;", "copy", "(Ljava/lang/String;JJLorg/json/JSONObject;)Lin/juspay/hypersdk/ota/ReleaseConfig$Config;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toJSON", "toString", "packageTimeout", "J", "getPackageTimeout", "properties", "Lorg/json/JSONObject;", "getProperties", "releaseConfigTimeout", "getReleaseConfigTimeout", "version", "Ljava/lang/String;", "getVersion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Config {
        private final long packageTimeout;
        private final JSONObject properties;
        private final long releaseConfigTimeout;
        private final String version;

        public Config(String str, long j, long j2, JSONObject jSONObject) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(jSONObject, "");
            this.version = str;
            this.releaseConfigTimeout = j;
            this.packageTimeout = j2;
            this.properties = jSONObject;
        }

        public final long getPackageTimeout() {
            return this.packageTimeout;
        }

        public final JSONObject getProperties() {
            return this.properties;
        }

        public final long getReleaseConfigTimeout() {
            return this.releaseConfigTimeout;
        }

        public final String getVersion() {
            return this.version;
        }

        public final JSONObject toJSON() throws JSONException {
            JSONObject jSONObjectPut = new JSONObject().put("version", this.version).put("release_config_timeout", this.releaseConfigTimeout).put("package_timeout", this.packageTimeout).put("properties", this.properties);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut, "");
            return jSONObjectPut;
        }

        public static /* synthetic */ Config copy$default(Config config, String str, long j, long j2, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = config.version;
            }
            if ((i & 2) != 0) {
                j = config.releaseConfigTimeout;
            }
            long j3 = j;
            if ((i & 4) != 0) {
                j2 = config.packageTimeout;
            }
            long j4 = j2;
            if ((i & 8) != 0) {
                jSONObject = config.properties;
            }
            return config.copy(str, j3, j4, jSONObject);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getReleaseConfigTimeout() {
            return this.releaseConfigTimeout;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getPackageTimeout() {
            return this.packageTimeout;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final JSONObject getProperties() {
            return this.properties;
        }

        public final Config copy(String p0, long p1, long p2, JSONObject p3) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p3, "");
            return new Config(p0, p1, p2, p3);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof Config)) {
                return false;
            }
            Config config = (Config) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.version, (Object) config.version) && this.releaseConfigTimeout == config.releaseConfigTimeout && this.packageTimeout == config.packageTimeout && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.properties, config.properties);
        }

        public final int hashCode() {
            return (((((this.version.hashCode() * 31) + Long.hashCode(this.releaseConfigTimeout)) * 31) + Long.hashCode(this.packageTimeout)) * 31) + this.properties.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Config(version=");
            sb.append(this.version);
            sb.append(", releaseConfigTimeout=");
            sb.append(this.releaseConfigTimeout);
            sb.append(", packageTimeout=");
            sb.append(this.packageTimeout);
            sb.append(", properties=");
            sb.append(this.properties);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000bR\u0017\u0010\u001c\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u000bR\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u000bR\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\rR\u001a\u0010&\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u000b"}, d2 = {"Lin/juspay/hypersdk/ota/ReleaseConfig$Resource;", "", "", "p0", "Ljava/net/URL;", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/net/URL;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/net/URL;", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/net/URL;Ljava/lang/String;Ljava/lang/String;)Lin/juspay/hypersdk/ota/ReleaseConfig$Resource;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lorg/json/JSONObject;", "toJSON", "()Lorg/json/JSONObject;", "toString", "extension", "Ljava/lang/String;", "getExtension", "fileName", "getFileName", "name", "getName", "url", "Ljava/net/URL;", "getUrl", "version", "getVersion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Resource {
        private final String extension;
        private final String fileName;
        private final String name;
        private final URL url;
        private final String version;

        public Resource(String str, URL url, String str2, String str3) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(url, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            this.name = str;
            this.url = url;
            this.version = str2;
            this.extension = str3;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('_');
            sb.append(str2);
            sb.append('.');
            sb.append(str3);
            this.fileName = sb.toString();
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof Resource)) {
                return false;
            }
            Resource resource = (Resource) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.name, (Object) resource.name) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.version, (Object) resource.version);
        }

        public final String getExtension() {
            return this.extension;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final String getName() {
            return this.name;
        }

        public final URL getUrl() {
            return this.url;
        }

        public final String getVersion() {
            return this.version;
        }

        public final int hashCode() {
            return (this.name.hashCode() * 31) + this.version.hashCode();
        }

        public final JSONObject toJSON() throws JSONException {
            JSONObject jSONObjectPut = new JSONObject().put("url", this.url.toString()).put("version", this.version).put("extension", this.extension);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut, "");
            return jSONObjectPut;
        }

        public static /* synthetic */ Resource copy$default(Resource resource, String str, URL url, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = resource.name;
            }
            if ((i & 2) != 0) {
                url = resource.url;
            }
            if ((i & 4) != 0) {
                str2 = resource.version;
            }
            if ((i & 8) != 0) {
                str3 = resource.extension;
            }
            return resource.copy(str, url, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final URL getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getExtension() {
            return this.extension;
        }

        public final Resource copy(String p0, URL p1, String p2, String p3) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            toMagicModuleMetaRepoModel.write(p3, "");
            return new Resource(p0, p1, p2, p3);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Resource(name=");
            sb.append(this.name);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", version=");
            sb.append(this.version);
            sb.append(", extension=");
            sb.append(this.extension);
            sb.append(')');
            return sb.toString();
        }
    }

    public static /* synthetic */ ReleaseConfig copy$default(ReleaseConfig releaseConfig, Config config, PackageManifest packageManifest, ResourceManifest resourceManifest, int i, Object obj) {
        if ((i & 1) != 0) {
            config = releaseConfig.config;
        }
        if ((i & 2) != 0) {
            packageManifest = releaseConfig.pkg;
        }
        if ((i & 4) != 0) {
            resourceManifest = releaseConfig.resources;
        }
        return releaseConfig.copy(config, packageManifest, resourceManifest);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00108\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007"}, d2 = {"Lin/juspay/hypersdk/ota/ReleaseConfig$Split;", "", "Ljava/net/URL;", "p0", "<init>", "(Ljava/net/URL;)V", "component1", "()Ljava/net/URL;", "copy", "(Ljava/net/URL;)Lin/juspay/hypersdk/ota/ReleaseConfig$Split;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "fileName", "Ljava/lang/String;", "getFileName", "url", "Ljava/net/URL;", "getUrl"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Split {
        private final String fileName;
        private final URL url;

        public Split(URL url) {
            toMagicModuleMetaRepoModel.write(url, "");
            this.url = url;
            String path = url.getPath();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(path, "");
            String str = (String) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem(TestGroupLSModel.write(path, new String[]{"/"}, 0, 6));
            if (TestGroupLSModel.AudioAttributesImplApi21Parcelizer(str, ".zip")) {
                this.fileName = TestGroupLSModel.read(str, ".zip", ".jsa", false);
            } else {
                this.fileName = str;
            }
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final URL getUrl() {
            return this.url;
        }

        public static /* synthetic */ Split copy$default(Split split, URL url, int i, Object obj) {
            if ((i & 1) != 0) {
                url = split.url;
            }
            return split.copy(url);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final URL getUrl() {
            return this.url;
        }

        public final Split copy(URL p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new Split(p0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof Split) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.url, ((Split) p0).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Split(url=");
            sb.append(this.url);
            sb.append(')');
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Config getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PackageManifest getPkg() {
        return this.pkg;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ResourceManifest getResources() {
        return this.resources;
    }

    public final ReleaseConfig copy(Config p0, PackageManifest p1, ResourceManifest p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new ReleaseConfig(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ReleaseConfig)) {
            return false;
        }
        ReleaseConfig releaseConfig = (ReleaseConfig) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.config, releaseConfig.config) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.pkg, releaseConfig.pkg) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.resources, releaseConfig.resources);
    }

    public final int hashCode() {
        return (((this.config.hashCode() * 31) + this.pkg.hashCode()) * 31) + this.resources.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReleaseConfig(config=");
        sb.append(this.config);
        sb.append(", pkg=");
        sb.append(this.pkg);
        sb.append(", resources=");
        sb.append(this.resources);
        sb.append(')');
        return sb.toString();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JH\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u0011J\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000eR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\t8G¢\u0006\u0006\u001a\u0004\b \u0010\u0015R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\t8G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0015R\u001a\u0010$\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0013R\u001a\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u000eR\u001a\u0010*\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0011R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0015R\u001a\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b1\u0010\u000e"}, d2 = {"Lin/juspay/hypersdk/ota/ReleaseConfig$PackageManifest;", "", "", "p0", "p1", "Lorg/json/JSONObject;", "p2", "Lin/juspay/hypersdk/ota/ReleaseConfig$Split;", "p3", "", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lin/juspay/hypersdk/ota/ReleaseConfig$Split;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lorg/json/JSONObject;", "component4", "()Lin/juspay/hypersdk/ota/ReleaseConfig$Split;", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lin/juspay/hypersdk/ota/ReleaseConfig$Split;Ljava/util/List;)Lin/juspay/hypersdk/ota/ReleaseConfig$PackageManifest;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toJSON", "toString", "getAllSplits", "allSplits", "getFileNames", "fileNames", "index", "Lin/juspay/hypersdk/ota/ReleaseConfig$Split;", "getIndex", "name", "Ljava/lang/String;", "getName", "properties", "Lorg/json/JSONObject;", "getProperties", "splits", "Ljava/util/List;", "getSplits", "version", "getVersion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PackageManifest {
        private final Split index;
        private final String name;
        private final JSONObject properties;
        private final List<Split> splits;
        private final String version;

        public PackageManifest(String str, String str2, JSONObject jSONObject, Split split, List<Split> list) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(jSONObject, "");
            toMagicModuleMetaRepoModel.write(split, "");
            toMagicModuleMetaRepoModel.write(list, "");
            this.name = str;
            this.version = str2;
            this.properties = jSONObject;
            this.index = split;
            this.splits = list;
        }

        public final List<Split> getAllSplits() {
            List<Split> listUnmodifiableList = Collections.unmodifiableList(IntermediateLoginResponseBody.read((Collection<? extends Split>) IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) this.splits), this.index));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listUnmodifiableList, "");
            return listUnmodifiableList;
        }

        public final List<String> getFileNames() {
            List<Split> allSplits = getAllSplits();
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) allSplits, 10));
            Iterator<T> it = allSplits.iterator();
            while (it.hasNext()) {
                arrayList.add(((Split) it.next()).getFileName());
            }
            return arrayList;
        }

        public final Split getIndex() {
            return this.index;
        }

        public final String getName() {
            return this.name;
        }

        public final JSONObject getProperties() {
            return this.properties;
        }

        public final List<Split> getSplits() {
            return this.splits;
        }

        public final String getVersion() {
            return this.version;
        }

        public final JSONObject toJSON() throws JSONException {
            JSONObject jSONObjectPut = new JSONObject().put("name", this.name).put("version", this.version).put("properties", this.properties).put("index", this.index.getUrl().toString());
            List<Split> list = this.splits;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Split) it.next()).getUrl().toString());
            }
            JSONObject jSONObjectPut2 = jSONObjectPut.put("splits", new JSONArray((Collection) arrayList));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut2, "");
            return jSONObjectPut2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PackageManifest copy$default(PackageManifest packageManifest, String str, String str2, JSONObject jSONObject, Split split, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = packageManifest.name;
            }
            if ((i & 2) != 0) {
                str2 = packageManifest.version;
            }
            String str3 = str2;
            if ((i & 4) != 0) {
                jSONObject = packageManifest.properties;
            }
            JSONObject jSONObject2 = jSONObject;
            if ((i & 8) != 0) {
                split = packageManifest.index;
            }
            Split split2 = split;
            if ((i & 16) != 0) {
                list = packageManifest.splits;
            }
            return packageManifest.copy(str, str3, jSONObject2, split2, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final JSONObject getProperties() {
            return this.properties;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Split getIndex() {
            return this.index;
        }

        public final List<Split> component5() {
            return this.splits;
        }

        public final PackageManifest copy(String p0, String p1, JSONObject p2, Split p3, List<Split> p4) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            toMagicModuleMetaRepoModel.write(p3, "");
            toMagicModuleMetaRepoModel.write(p4, "");
            return new PackageManifest(p0, p1, p2, p3, p4);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof PackageManifest)) {
                return false;
            }
            PackageManifest packageManifest = (PackageManifest) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.name, (Object) packageManifest.name) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.version, (Object) packageManifest.version) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.properties, packageManifest.properties) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.index, packageManifest.index) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.splits, packageManifest.splits);
        }

        public final int hashCode() {
            return (((((((this.name.hashCode() * 31) + this.version.hashCode()) * 31) + this.properties.hashCode()) * 31) + this.index.hashCode()) * 31) + this.splits.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PackageManifest(name=");
            sb.append(this.name);
            sb.append(", version=");
            sb.append(this.version);
            sb.append(", properties=");
            sb.append(this.properties);
            sb.append(", index=");
            sb.append(this.index);
            sb.append(", splits=");
            sb.append(this.splits);
            sb.append(')');
            return sb.toString();
        }
    }
}
