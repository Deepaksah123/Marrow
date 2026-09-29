package kotlin;

import com.marrow.data.models.custommodule.FilterParams;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0001\n\u0002\b\u0015\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\"\u001a\u00020\tH\u0086\bJ\u001b\u00101\u001a\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000004H\u0000¢\u0006\u0002\b5J\u001f\u00106\u001a\u0002022\u0012\u00107\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000008\"\u00020\u0000¢\u0006\u0002\u00109J\u001f\u0010:\u001a\u0002022\u0012\u00107\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000008\"\u00020\u0000¢\u0006\u0002\u00109JL\u0010;\u001a\b\u0012\u0004\u0012\u0002H=0<\"\n\b\u0000\u0010=\u0018\u0001*\u00020\u00012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010?\u001a\u00020@2\u0016\b\n\u0010A\u001a\u0010\u0012\u0004\u0012\u00020(\u0018\u00010Bj\u0004\u0018\u0001`CH\u0086\bø\u0001\u0000JN\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H=0<\"\n\b\u0000\u0010=\u0018\u0001*\u00020\u00012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010?\u001a\u00020@2\u0016\b\n\u0010A\u001a\u0010\u0012\u0004\u0012\u00020(\u0018\u00010Bj\u0004\u0018\u0001`CH\u0086\bø\u0001\u0000JA\u0010E\u001a\u0002H=\"\n\b\u0000\u0010=\u0018\u0001*\u00020\u00012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00042\u0016\b\n\u0010A\u001a\u0010\u0012\u0004\u0012\u00020(\u0018\u00010Bj\u0004\u0018\u0001`CH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010FJ\u001c\u0010G\u001a\u0004\u0018\u0001H=\"\n\b\u0000\u0010=\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0002\u0010\u001dJC\u0010H\u001a\u0004\u0018\u0001H=\"\n\b\u0000\u0010=\u0018\u0001*\u00020\u00012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00042\u0016\b\n\u0010A\u001a\u0010\u0012\u0004\u0012\u00020(\u0018\u00010Bj\u0004\u0018\u0001`CH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010FJC\u0010H\u001a\u0004\u0018\u0001H=\"\u0004\b\u0000\u0010=2\n\u0010I\u001a\u0006\u0012\u0002\b\u00030J2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010A\u001a\u0010\u0012\u0004\u0012\u00020(\u0018\u00010Bj\u0004\u0018\u0001`C¢\u0006\u0002\u0010KJ\u001f\u0010H\u001a\u0004\u0018\u0001H=\"\u0004\b\u0000\u0010=2\u0006\u0010L\u001a\u00020MH\u0000¢\u0006\u0004\bN\u0010OJA\u0010E\u001a\u0002H=\"\u0004\b\u0000\u0010=2\n\u0010I\u001a\u0006\u0012\u0002\b\u00030J2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010A\u001a\u0010\u0012\u0004\u0012\u00020(\u0018\u00010Bj\u0004\u0018\u0001`C¢\u0006\u0002\u0010KJ7\u0010P\u001a\u0002H=\"\u0004\b\u0000\u0010=2\n\u0010I\u001a\u0006\u0012\u0002\b\u00030J2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010A\u001a\u0004\u0018\u00010(H\u0007¢\u0006\u0002\u0010QJ5\u0010R\u001a\u0002H=\"\u0004\b\u0000\u0010=2\n\u0010I\u001a\u0006\u0012\u0002\b\u00030J2\b\u0010>\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010A\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0002\u0010QJ\u001f\u0010S\u001a\u0002022\n\u0010I\u001a\u0006\u0012\u0002\b\u00030J2\b\u0010>\u001a\u0004\u0018\u00010\u0004H\u0082\bJ$\u0010T\u001a\u0002022\n\u0010I\u001a\u0006\u0012\u0002\b\u00030J2\u0006\u0010U\u001a\u00020VH\u0082\b¢\u0006\u0004\bW\u0010XJ3\u0010Y\u001a\u0002H=\"\u0004\b\u0000\u0010=2\b\u0010>\u001a\u0004\u0018\u00010\u00042\n\u0010I\u001a\u0006\u0012\u0002\b\u00030J2\b\u0010A\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0002\u0010ZJ\t\u0010[\u001a\u000202H\u0082\bJ%\u0010\\\u001a\u0002H=\"\u0004\b\u0000\u0010=2\b\u0010A\u001a\u0004\u0018\u00010(2\u0006\u0010]\u001a\u00020MH\u0002¢\u0006\u0002\u0010^J\u0016\u0010_\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010A\u001a\u00020(H\u0002J\u0016\u0010`\u001a\u0002022\f\u0010a\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002J\u000e\u0010b\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002J\u001b\u0010c\u001a\u0002H=\"\u0004\b\u0000\u0010=2\u0006\u0010]\u001a\u00020MH\u0002¢\u0006\u0002\u0010OJ\u001d\u0010d\u001a\u0004\u0018\u0001H=\"\u0004\b\u0000\u0010=2\u0006\u0010L\u001a\u00020MH\u0002¢\u0006\u0002\u0010OJ\u001e\u0010e\u001a\u0004\u0018\u0001H=\"\u0004\b\u0000\u0010=2\u0006\u0010L\u001a\u00020MH\u0082\b¢\u0006\u0002\u0010OJ\u001e\u0010f\u001a\u0004\u0018\u0001H=\"\u0004\b\u0000\u0010=2\u0006\u0010L\u001a\u00020MH\u0082\b¢\u0006\u0002\u0010OJ\u001e\u0010g\u001a\u0004\u0018\u0001H=\"\u0004\b\u0000\u0010=2\u0006\u0010L\u001a\u00020MH\u0082\b¢\u0006\u0002\u0010OJ\u001d\u0010h\u001a\u0004\u0018\u0001H=\"\u0004\b\u0000\u0010=2\u0006\u0010L\u001a\u00020MH\u0002¢\u0006\u0002\u0010OJ\u001c\u0010i\u001a\u0002H=\"\u0004\b\u0000\u0010=2\u0006\u0010L\u001a\u00020MH\u0082\b¢\u0006\u0002\u0010OJ\u001d\u0010j\u001a\u0004\u0018\u0001H=\"\u0004\b\u0000\u0010=2\u0006\u0010L\u001a\u00020MH\u0002¢\u0006\u0002\u0010OJ\u0011\u0010k\u001a\u00020l2\u0006\u0010L\u001a\u00020MH\u0082\bJR\u0010m\u001a\u000202\"\u0006\b\u0000\u0010=\u0018\u00012\u0006\u0010n\u001a\u0002H=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00042\u0012\b\u0002\u0010o\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030J042\b\b\u0002\u0010p\u001a\u00020\t2\b\b\u0002\u0010q\u001a\u00020\tH\u0086\b¢\u0006\u0002\u0010rJ\u0006\u0010s\u001a\u00020\u000bJ\u0012\u0010t\u001a\u00020\u00002\n\u0010u\u001a\u00060\u0006j\u0002`\u0007J\u000e\u0010v\u001a\u0002022\u0006\u0010w\u001a\u00020$J\u001b\u0010x\u001a\b\u0012\u0004\u0012\u0002H=04\"\n\b\u0000\u0010=\u0018\u0001*\u00020\u0001H\u0086\bJ\u001e\u0010x\u001a\b\u0012\u0004\u0012\u0002H=04\"\u0004\b\u0000\u0010=2\n\u0010I\u001a\u0006\u0012\u0002\b\u00030JJ%\u0010y\u001a\u0002H=\"\b\b\u0000\u0010=*\u00020\u00012\u0006\u0010z\u001a\u00020\u00062\u0006\u0010{\u001a\u0002H=¢\u0006\u0002\u0010|J\u001f\u0010}\u001a\u0004\u0018\u0001H=\"\b\b\u0000\u0010=*\u00020\u00012\u0006\u0010z\u001a\u00020\u0006¢\u0006\u0002\u0010~J\u001d\u0010y\u001a\u0002H=\"\b\b\u0000\u0010=*\u00020\u00012\u0006\u0010z\u001a\u00020\u0006¢\u0006\u0002\u0010~J\u0006\u0010\u007f\u001a\u000202J\t\u0010\u0080\u0001\u001a\u00020\u0006H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u001c\u0010\n\u001a\u00020\u000b8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00000\u0018j\b\u0012\u0004\u0012\u00020\u0000`\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u001a\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0012R\u001e\u0010#\u001a\u0012\u0012\u0004\u0012\u00020$0\u0018j\b\u0012\u0004\u0012\u00020$`\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R:\u0010%\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'\u0018\u00010&j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'\u0018\u0001`)8\u0002@\u0002X\u0083\u000e¢\u0006\n\n\u0002\u0010+\u0012\u0004\b*\u0010\u0014R\u000e\u0010,\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010-\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0081\u0001"}, d2 = {"Lorg/koin/core/scope/Scope;", "", "Lorg/koin/mp/Lockable;", "scopeQualifier", "Lorg/koin/core/qualifier/Qualifier;", "id", "", "Lorg/koin/core/scope/ScopeID;", "isRoot", "", "_koin", "Lorg/koin/core/Koin;", "<init>", "(Lorg/koin/core/qualifier/Qualifier;Ljava/lang/String;ZLorg/koin/core/Koin;)V", "getScopeQualifier", "()Lorg/koin/core/qualifier/Qualifier;", "getId", "()Ljava/lang/String;", "()Z", "get_koin$annotations", "()V", "get_koin", "()Lorg/koin/core/Koin;", "linkedScopes", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "sourceValue", "getSourceValue$annotations", "getSourceValue", "()Ljava/lang/Object;", "setSourceValue", "(Ljava/lang/Object;)V", "closed", "getClosed", "isNotClosed", "_callbacks", "Lorg/koin/core/scope/ScopeCallback;", "parameterStack", "Ljava/lang/ThreadLocal;", "Lkotlin/collections/ArrayDeque;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/mp/ThreadLocal;", "getParameterStack$annotations", "Ljava/lang/ThreadLocal;", "_closed", "logger", "Lorg/koin/core/logger/Logger;", "getLogger", "()Lorg/koin/core/logger/Logger;", "create", "", "links", "", "create$koin_core", "linkTo", "scopes", "", "([Lorg/koin/core/scope/Scope;)V", "unlink", "inject", "Lkotlin/Lazy;", "T", "qualifier", FilterParams.KEY_MODE, "Lkotlin/LazyThreadSafetyMode;", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersDefinition;", "injectOrNull", "get", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getSource", "getOrNull", "clazz", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ctx", "Lorg/koin/core/instance/ResolutionContext;", "getOrNull$koin_core", "(Lorg/koin/core/instance/ResolutionContext;)Ljava/lang/Object;", "getWithParameters", "(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;", "resolve", "logInstanceRequest", "logInstanceDuration", "duration", "Lkotlin/time/Duration;", "logInstanceDuration-HG0u8IE", "(Lkotlin/reflect/KClass;J)V", "resolveInstance", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;", "checkScopeIsOpen", "stackParametersCall", "instanceContext", "(Lorg/koin/core/parameter/ParametersHolder;Lorg/koin/core/instance/ResolutionContext;)Ljava/lang/Object;", "onParameterOnStack", "clearParameterStack", "stack", "getOrCreateParameterStack", "resolveFromContext", "resolveFromRegistry", "resolveFromInjectedParameters", "resolveFromStackedParameters", "resolveFromScopeSource", "resolveFromParentScopes", "throwNoDefinitionFound", "findInOtherScope", "throwDefinitionNotFound", "", "declare", "instance", "secondaryTypes", "allowOverride", "holdInstance", "(Ljava/lang/Object;Lorg/koin/core/qualifier/Qualifier;Ljava/util/List;ZZ)V", "getKoin", "getScope", "scopeID", "registerCallback", "callback", "getAll", "getProperty", "key", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getPropertyOrNull", "(Ljava/lang/String;)Ljava/lang/Object;", "close", "toString", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecentUpdatesFilterResponse {
    private final resetBookmarks AudioAttributesCompatParcelizer;
    private ThreadLocal<setCardContent<Object>> AudioAttributesImplApi26Parcelizer;
    private final CourseConfigV2RepoModelKt AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private final LinkedHashSet<RecentUpdatesFilterResponse> MediaBrowserCompatCustomActionResultReceiver;
    private Object MediaBrowserCompatItemReceiver;
    private final LinkedHashSet<RecentUpdatesReferencesResponse> RemoteActionCompatParcelizer;
    private final boolean read;
    private final String write;

    public /* synthetic */ RecentUpdatesFilterResponse(CourseConfigV2RepoModelKt courseConfigV2RepoModelKt, String str, boolean z, resetBookmarks resetbookmarks, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(courseConfigV2RepoModelKt, str, (i & 4) != 0 ? false : z, resetbookmarks);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final CourseConfigV2RepoModelKt getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    public RecentUpdatesFilterResponse(CourseConfigV2RepoModelKt courseConfigV2RepoModelKt, String str, boolean z, resetBookmarks resetbookmarks) {
        toMagicModuleMetaRepoModel.write(courseConfigV2RepoModelKt, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(resetbookmarks, "");
        this.AudioAttributesImplBaseParcelizer = courseConfigV2RepoModelKt;
        this.write = str;
        this.read = z;
        this.AudioAttributesCompatParcelizer = resetbookmarks;
        this.MediaBrowserCompatCustomActionResultReceiver = new LinkedHashSet<>();
        this.RemoteActionCompatParcelizer = new LinkedHashSet<>();
    }

    public final getBookmarked write() {
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public final void write(RecentUpdatesFilterResponse... recentUpdatesFilterResponseArr) {
        toMagicModuleMetaRepoModel.write(recentUpdatesFilterResponseArr, "");
        if (!this.read) {
            IntermediateLoginResponseBody.read((Collection) this.MediaBrowserCompatCustomActionResultReceiver, (Object[]) recentUpdatesFilterResponseArr);
            return;
        }
        throw new IllegalStateException("Can't add scope link to a root scope".toString());
    }

    public final void read(RecentUpdatesReferencesResponse recentUpdatesReferencesResponse) {
        toMagicModuleMetaRepoModel.write(recentUpdatesReferencesResponse, "");
        this.RemoteActionCompatParcelizer.add(recentUpdatesReferencesResponse);
    }

    public final void IconCompatParcelizer() {
        SchemaDetailLessonV2 schemaDetailLessonV2 = SchemaDetailLessonV2.read;
        SchemaDetailLessonV2.write(this, new getCreatedOnDateMs() { // from class: o.getListOfAssociatedLessons
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return RecentUpdatesFilterResponse.AudioAttributesCompatParcelizer(this.write);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(RecentUpdatesFilterResponse recentUpdatesFilterResponse) {
        getBookmarked getbookmarkedRemoteActionCompatParcelizer = recentUpdatesFilterResponse.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        StringBuilder sb = new StringBuilder("|- (-) Scope - id:'");
        sb.append(recentUpdatesFilterResponse.write);
        sb.append('\'');
        getbookmarkedRemoteActionCompatParcelizer.write(sb.toString());
        Iterator<T> it = recentUpdatesFilterResponse.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            ((RecentUpdatesReferencesResponse) it.next()).read(recentUpdatesFilterResponse);
        }
        recentUpdatesFilterResponse.RemoteActionCompatParcelizer.clear();
        recentUpdatesFilterResponse.IconCompatParcelizer = true;
        recentUpdatesFilterResponse.MediaBrowserCompatItemReceiver = null;
        ThreadLocal<setCardContent<Object>> threadLocal = recentUpdatesFilterResponse.AudioAttributesImplApi26Parcelizer;
        recentUpdatesFilterResponse.AudioAttributesImplApi26Parcelizer = null;
        recentUpdatesFilterResponse.AudioAttributesCompatParcelizer.read().write(recentUpdatesFilterResponse);
        return getShowPopup.INSTANCE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("['");
        sb.append(this.write);
        sb.append("']");
        return sb.toString();
    }
}
