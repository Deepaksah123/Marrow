package kotlin;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\b\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\tB\u0013\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0014R\u001e\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e0\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001fR \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020 0\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001fR\u001e\u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020$0#8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010%R\u0016\u0010&\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\"\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010#8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010%R\u0014\u0010\u001b\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010*"}, d2 = {"Lo/markCompletelambda2;", "Lo/isHdPlaybackError;", "", "Lo/downloadMagicModuleDetaillambda1;", "Ljava/lang/Class;", "p0", "<init>", "(Ljava/lang/Class;)V", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/Object;)Z", "", "MediaMetadataCompat", "()Ljava/lang/Void;", "equals", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Ljava/lang/Class;", "RemoteActionCompatParcelizer", "()Ljava/lang/Class;", "AudioAttributesImplApi26Parcelizer", "read", "AudioAttributesImplBaseParcelizer", "write", "", "Lo/isKycAuditIncomplete;", "()Ljava/util/Collection;", "Lkotlin/reflect/KFunction;", "aO_", "MediaBrowserCompatItemReceiver", "", "", "()Ljava/util/List;", "MediaBrowserCompatCustomActionResultReceiver", "()Ljava/lang/Object;", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatMediaItem", "()Z", "RatingCompat", "MediaBrowserCompatSearchResultReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class markCompletelambda2 implements isHdPlaybackError<Object>, downloadMagicModuleDetaillambda1 {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<Class<? extends setRenewGrpId<?>>, Integer> write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Class<?> RemoteActionCompatParcelizer;

    public markCompletelambda2(Class<?> cls) {
        toMagicModuleMetaRepoModel.write(cls, "");
        this.RemoteActionCompatParcelizer = cls;
    }

    @Override // kotlin.downloadMagicModuleDetaillambda1
    public final Class<?> RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.isHdPlaybackError
    public final String AudioAttributesImplApi26Parcelizer() {
        return Companion.IconCompatParcelizer(RemoteActionCompatParcelizer());
    }

    @Override // kotlin.isHdPlaybackError
    public final String AudioAttributesImplBaseParcelizer() {
        return Companion.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer());
    }

    @Override // kotlin.isHdPlaybackError
    public final Collection<isKycAuditIncomplete<?>> IconCompatParcelizer() {
        MediaMetadataCompat();
        throw new PlanDetailsCreator();
    }

    @Override // kotlin.isHdPlaybackError
    public final Collection<getErrorMessageId<Object>> write() {
        MediaMetadataCompat();
        throw new PlanDetailsCreator();
    }

    @Override // kotlin.isHdPlaybackError
    public final Collection<isHdPlaybackError<?>> aO_() {
        MediaMetadataCompat();
        throw new PlanDetailsCreator();
    }

    @Override // kotlin.McqFaq
    public final List<Annotation> MediaBrowserCompatItemReceiver() {
        MediaMetadataCompat();
        throw new PlanDetailsCreator();
    }

    @Override // kotlin.isHdPlaybackError
    public final Object MediaBrowserCompatCustomActionResultReceiver() {
        MediaMetadataCompat();
        throw new PlanDetailsCreator();
    }

    @Override // kotlin.isHdPlaybackError
    public final boolean AudioAttributesCompatParcelizer(Object p0) {
        return Companion.RemoteActionCompatParcelizer(p0, RemoteActionCompatParcelizer());
    }

    @Override // kotlin.isHdPlaybackError
    public final List<isHdPlaybackError<? extends Object>> AudioAttributesImplApi21Parcelizer() {
        MediaMetadataCompat();
        throw new PlanDetailsCreator();
    }

    @Override // kotlin.isHdPlaybackError
    public final boolean MediaBrowserCompatMediaItem() {
        MediaMetadataCompat();
        throw new PlanDetailsCreator();
    }

    @Override // kotlin.isHdPlaybackError
    public final boolean RatingCompat() {
        MediaMetadataCompat();
        throw new PlanDetailsCreator();
    }

    private static Void MediaMetadataCompat() {
        throw new getFeedbacks();
    }

    public final boolean equals(Object p0) {
        return (p0 instanceof markCompletelambda2) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(MagicModuleFeedbackRequestBody.write(this), MagicModuleFeedbackRequestBody.write((isHdPlaybackError) p0));
    }

    public final int hashCode() {
        return MagicModuleFeedbackRequestBody.write(this).hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RemoteActionCompatParcelizer().toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }

    /* JADX INFO: renamed from: o.markCompletelambda2$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\u0006\u0010\nJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\u000b\u0010\nJ#\u0010\b\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\b\u0010\u000eR,\u0010\u0006\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00100\t\u0012\u0004\u0012\u00020\u00110\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/markCompletelambda2$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "p0", "IconCompatParcelizer", "(Ljava/lang/String;)Ljava/lang/String;", "RemoteActionCompatParcelizer", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/String;", "AudioAttributesCompatParcelizer", "p1", "", "(Ljava/lang/Object;Ljava/lang/Class;)Z", "", "Lkotlin/Function;", "", "write", "Ljava/util/Map;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private static String IconCompatParcelizer(String p0) {
            int iHashCode = p0.hashCode();
            switch (iHashCode) {
                case -2061550653:
                    if (p0.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                        return "kotlin.Double.Companion";
                    }
                    return null;
                case -2056817302:
                    if (p0.equals("java.lang.Integer")) {
                        return "kotlin.Int";
                    }
                    return null;
                case -2034166429:
                    if (p0.equals("java.lang.Cloneable")) {
                        return "kotlin.Cloneable";
                    }
                    return null;
                case -1979556166:
                    if (p0.equals("java.lang.annotation.Annotation")) {
                        return "kotlin.Annotation";
                    }
                    return null;
                case -1571515090:
                    if (p0.equals("java.lang.Comparable")) {
                        return "kotlin.Comparable";
                    }
                    return null;
                case -1383349348:
                    if (p0.equals("java.util.Map")) {
                        return "kotlin.collections.Map";
                    }
                    return null;
                case -1383343454:
                    if (p0.equals("java.util.Set")) {
                        return "kotlin.collections.Set";
                    }
                    return null;
                case -1325958191:
                    if (p0.equals("double")) {
                        return "kotlin.Double";
                    }
                    return null;
                case -1182275604:
                    if (p0.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                        return "kotlin.Byte.Companion";
                    }
                    return null;
                case -1062240117:
                    if (p0.equals("java.lang.CharSequence")) {
                        return "kotlin.CharSequence";
                    }
                    return null;
                case -688322466:
                    if (p0.equals("java.util.Collection")) {
                        return "kotlin.collections.Collection";
                    }
                    return null;
                case -527879800:
                    if (p0.equals("java.lang.Float")) {
                        return "kotlin.Float";
                    }
                    return null;
                case -515992664:
                    if (p0.equals("java.lang.Short")) {
                        return "kotlin.Short";
                    }
                    return null;
                case -246476834:
                    if (p0.equals("kotlin.jvm.internal.CharCompanionObject")) {
                        return "kotlin.Char.Companion";
                    }
                    return null;
                case -207262728:
                    if (p0.equals("kotlin.jvm.internal.LongCompanionObject")) {
                        return "kotlin.Long.Companion";
                    }
                    return null;
                case -165139126:
                    if (p0.equals("java.util.Map$Entry")) {
                        return "kotlin.collections.Map.Entry";
                    }
                    return null;
                case 104431:
                    if (p0.equals("int")) {
                        return "kotlin.Int";
                    }
                    return null;
                case 3039496:
                    if (p0.equals("byte")) {
                        return "kotlin.Byte";
                    }
                    return null;
                case 3052374:
                    if (p0.equals("char")) {
                        return "kotlin.Char";
                    }
                    return null;
                case 3327612:
                    if (p0.equals("long")) {
                        return "kotlin.Long";
                    }
                    return null;
                case 64711720:
                    if (p0.equals("boolean")) {
                        return "kotlin.Boolean";
                    }
                    return null;
                case 65821278:
                    if (p0.equals("java.util.List")) {
                        return "kotlin.collections.List";
                    }
                    return null;
                case 77230534:
                    if (p0.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                        return "kotlin.Short.Companion";
                    }
                    return null;
                case 97526364:
                    if (p0.equals("float")) {
                        return "kotlin.Float";
                    }
                    return null;
                case 109413500:
                    if (p0.equals("short")) {
                        return "kotlin.Short";
                    }
                    return null;
                case 155276373:
                    if (p0.equals("java.lang.Character")) {
                        return "kotlin.Char";
                    }
                    return null;
                case 226173651:
                    if (p0.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                        return "kotlin.Enum.Companion";
                    }
                    return null;
                case 344809556:
                    if (p0.equals("java.lang.Boolean")) {
                        return "kotlin.Boolean";
                    }
                    return null;
                case 398507100:
                    if (p0.equals("java.lang.Byte")) {
                        return "kotlin.Byte";
                    }
                    return null;
                case 398585941:
                    if (p0.equals("java.lang.Enum")) {
                        return "kotlin.Enum";
                    }
                    return null;
                case 398795216:
                    if (p0.equals("java.lang.Long")) {
                        return "kotlin.Long";
                    }
                    return null;
                case 482629606:
                    if (p0.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                        return "kotlin.Float.Companion";
                    }
                    return null;
                case 499831342:
                    if (p0.equals("java.util.Iterator")) {
                        return "kotlin.collections.Iterator";
                    }
                    return null;
                case 577341676:
                    if (p0.equals("java.util.ListIterator")) {
                        return "kotlin.collections.ListIterator";
                    }
                    return null;
                case 599019395:
                    if (p0.equals("kotlin.jvm.internal.StringCompanionObject")) {
                        return "kotlin.String.Companion";
                    }
                    return null;
                case 761287205:
                    if (p0.equals("java.lang.Double")) {
                        return "kotlin.Double";
                    }
                    return null;
                case 1052881309:
                    if (p0.equals("java.lang.Number")) {
                        return "kotlin.Number";
                    }
                    return null;
                case 1063877011:
                    if (p0.equals("java.lang.Object")) {
                        return "kotlin.Any";
                    }
                    return null;
                case 1195259493:
                    if (p0.equals("java.lang.String")) {
                        return "kotlin.String";
                    }
                    return null;
                case 1275614662:
                    if (p0.equals("java.lang.Iterable")) {
                        return "kotlin.collections.Iterable";
                    }
                    return null;
                case 1383693018:
                    if (p0.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                        return "kotlin.Boolean.Companion";
                    }
                    return null;
                case 1630335596:
                    if (p0.equals("java.lang.Throwable")) {
                        return "kotlin.Throwable";
                    }
                    return null;
                case 1877171123:
                    if (p0.equals("kotlin.jvm.internal.IntCompanionObject")) {
                        return "kotlin.Int.Companion";
                    }
                    return null;
                default:
                    switch (iHashCode) {
                        case -1811142716:
                            if (p0.equals("kotlin.jvm.functions.Function10")) {
                                return "kotlin.Function10";
                            }
                            return null;
                        case -1811142715:
                            if (p0.equals("kotlin.jvm.functions.Function11")) {
                                return "kotlin.Function11";
                            }
                            return null;
                        case -1811142714:
                            if (p0.equals("kotlin.jvm.functions.Function12")) {
                                return "kotlin.Function12";
                            }
                            return null;
                        case -1811142713:
                            if (p0.equals("kotlin.jvm.functions.Function13")) {
                                return "kotlin.Function13";
                            }
                            return null;
                        case -1811142712:
                            if (p0.equals("kotlin.jvm.functions.Function14")) {
                                return "kotlin.Function14";
                            }
                            return null;
                        case -1811142711:
                            if (p0.equals("kotlin.jvm.functions.Function15")) {
                                return "kotlin.Function15";
                            }
                            return null;
                        case -1811142710:
                            if (p0.equals("kotlin.jvm.functions.Function16")) {
                                return "kotlin.Function16";
                            }
                            return null;
                        case -1811142709:
                            if (p0.equals("kotlin.jvm.functions.Function17")) {
                                return "kotlin.Function17";
                            }
                            return null;
                        case -1811142708:
                            if (p0.equals("kotlin.jvm.functions.Function18")) {
                                return "kotlin.Function18";
                            }
                            return null;
                        case -1811142707:
                            if (p0.equals("kotlin.jvm.functions.Function19")) {
                                return "kotlin.Function19";
                            }
                            return null;
                        default:
                            switch (iHashCode) {
                                case -1811142685:
                                    if (p0.equals("kotlin.jvm.functions.Function20")) {
                                        return "kotlin.Function20";
                                    }
                                    return null;
                                case -1811142684:
                                    if (p0.equals("kotlin.jvm.functions.Function21")) {
                                        return "kotlin.Function21";
                                    }
                                    return null;
                                case -1811142683:
                                    if (p0.equals("kotlin.jvm.functions.Function22")) {
                                        return "kotlin.Function22";
                                    }
                                    return null;
                                default:
                                    switch (iHashCode) {
                                        case 80123371:
                                            if (p0.equals("kotlin.jvm.functions.Function0")) {
                                                return "kotlin.Function0";
                                            }
                                            return null;
                                        case 80123372:
                                            if (p0.equals("kotlin.jvm.functions.Function1")) {
                                                return "kotlin.Function1";
                                            }
                                            return null;
                                        case 80123373:
                                            if (p0.equals("kotlin.jvm.functions.Function2")) {
                                                return "kotlin.Function2";
                                            }
                                            return null;
                                        case 80123374:
                                            if (p0.equals("kotlin.jvm.functions.Function3")) {
                                                return "kotlin.Function3";
                                            }
                                            return null;
                                        case 80123375:
                                            if (p0.equals("kotlin.jvm.functions.Function4")) {
                                                return "kotlin.Function4";
                                            }
                                            return null;
                                        case 80123376:
                                            if (p0.equals("kotlin.jvm.functions.Function5")) {
                                                return "kotlin.Function5";
                                            }
                                            return null;
                                        case 80123377:
                                            if (p0.equals("kotlin.jvm.functions.Function6")) {
                                                return "kotlin.Function6";
                                            }
                                            return null;
                                        case 80123378:
                                            if (p0.equals("kotlin.jvm.functions.Function7")) {
                                                return "kotlin.Function7";
                                            }
                                            return null;
                                        case 80123379:
                                            if (p0.equals("kotlin.jvm.functions.Function8")) {
                                                return "kotlin.Function8";
                                            }
                                            return null;
                                        case 80123380:
                                            if (p0.equals("kotlin.jvm.functions.Function9")) {
                                                return "kotlin.Function9";
                                            }
                                            return null;
                                        default:
                                            return null;
                                    }
                            }
                    }
            }
        }

        private static String RemoteActionCompatParcelizer(String p0) {
            int iHashCode = p0.hashCode();
            switch (iHashCode) {
                case -2061550653:
                    if (p0.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                        return "Companion";
                    }
                    return null;
                case -2056817302:
                    if (p0.equals("java.lang.Integer")) {
                        return "Int";
                    }
                    return null;
                case -2034166429:
                    if (p0.equals("java.lang.Cloneable")) {
                        return "Cloneable";
                    }
                    return null;
                case -1979556166:
                    if (p0.equals("java.lang.annotation.Annotation")) {
                        return "Annotation";
                    }
                    return null;
                case -1571515090:
                    if (p0.equals("java.lang.Comparable")) {
                        return "Comparable";
                    }
                    return null;
                case -1383349348:
                    if (p0.equals("java.util.Map")) {
                        return "Map";
                    }
                    return null;
                case -1383343454:
                    if (p0.equals("java.util.Set")) {
                        return "Set";
                    }
                    return null;
                case -1325958191:
                    if (p0.equals("double")) {
                        return "Double";
                    }
                    return null;
                case -1182275604:
                    if (p0.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                        return "Companion";
                    }
                    return null;
                case -1062240117:
                    if (p0.equals("java.lang.CharSequence")) {
                        return "CharSequence";
                    }
                    return null;
                case -688322466:
                    if (p0.equals("java.util.Collection")) {
                        return "Collection";
                    }
                    return null;
                case -527879800:
                    if (p0.equals("java.lang.Float")) {
                        return "Float";
                    }
                    return null;
                case -515992664:
                    if (p0.equals("java.lang.Short")) {
                        return "Short";
                    }
                    return null;
                case -246476834:
                    if (p0.equals("kotlin.jvm.internal.CharCompanionObject")) {
                        return "Companion";
                    }
                    return null;
                case -207262728:
                    if (p0.equals("kotlin.jvm.internal.LongCompanionObject")) {
                        return "Companion";
                    }
                    return null;
                case -165139126:
                    if (p0.equals("java.util.Map$Entry")) {
                        return "Entry";
                    }
                    return null;
                case 104431:
                    if (p0.equals("int")) {
                        return "Int";
                    }
                    return null;
                case 3039496:
                    if (p0.equals("byte")) {
                        return "Byte";
                    }
                    return null;
                case 3052374:
                    if (p0.equals("char")) {
                        return "Char";
                    }
                    return null;
                case 3327612:
                    if (p0.equals("long")) {
                        return "Long";
                    }
                    return null;
                case 64711720:
                    if (p0.equals("boolean")) {
                        return "Boolean";
                    }
                    return null;
                case 65821278:
                    if (p0.equals("java.util.List")) {
                        return "List";
                    }
                    return null;
                case 77230534:
                    if (p0.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                        return "Companion";
                    }
                    return null;
                case 97526364:
                    if (p0.equals("float")) {
                        return "Float";
                    }
                    return null;
                case 109413500:
                    if (p0.equals("short")) {
                        return "Short";
                    }
                    return null;
                case 155276373:
                    if (p0.equals("java.lang.Character")) {
                        return "Char";
                    }
                    return null;
                case 226173651:
                    if (p0.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                        return "Companion";
                    }
                    return null;
                case 344809556:
                    if (p0.equals("java.lang.Boolean")) {
                        return "Boolean";
                    }
                    return null;
                case 398507100:
                    if (p0.equals("java.lang.Byte")) {
                        return "Byte";
                    }
                    return null;
                case 398585941:
                    if (p0.equals("java.lang.Enum")) {
                        return "Enum";
                    }
                    return null;
                case 398795216:
                    if (p0.equals("java.lang.Long")) {
                        return "Long";
                    }
                    return null;
                case 482629606:
                    if (p0.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                        return "Companion";
                    }
                    return null;
                case 499831342:
                    if (p0.equals("java.util.Iterator")) {
                        return "Iterator";
                    }
                    return null;
                case 577341676:
                    if (p0.equals("java.util.ListIterator")) {
                        return "ListIterator";
                    }
                    return null;
                case 599019395:
                    if (p0.equals("kotlin.jvm.internal.StringCompanionObject")) {
                        return "Companion";
                    }
                    return null;
                case 761287205:
                    if (p0.equals("java.lang.Double")) {
                        return "Double";
                    }
                    return null;
                case 1052881309:
                    if (p0.equals("java.lang.Number")) {
                        return "Number";
                    }
                    return null;
                case 1063877011:
                    if (p0.equals("java.lang.Object")) {
                        return "Any";
                    }
                    return null;
                case 1195259493:
                    if (p0.equals("java.lang.String")) {
                        return "String";
                    }
                    return null;
                case 1275614662:
                    if (p0.equals("java.lang.Iterable")) {
                        return "Iterable";
                    }
                    return null;
                case 1383693018:
                    if (p0.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                        return "Companion";
                    }
                    return null;
                case 1630335596:
                    if (p0.equals("java.lang.Throwable")) {
                        return "Throwable";
                    }
                    return null;
                case 1877171123:
                    if (p0.equals("kotlin.jvm.internal.IntCompanionObject")) {
                        return "Companion";
                    }
                    return null;
                default:
                    switch (iHashCode) {
                        case -1811142716:
                            if (p0.equals("kotlin.jvm.functions.Function10")) {
                                return "Function10";
                            }
                            return null;
                        case -1811142715:
                            if (p0.equals("kotlin.jvm.functions.Function11")) {
                                return "Function11";
                            }
                            return null;
                        case -1811142714:
                            if (p0.equals("kotlin.jvm.functions.Function12")) {
                                return "Function12";
                            }
                            return null;
                        case -1811142713:
                            if (p0.equals("kotlin.jvm.functions.Function13")) {
                                return "Function13";
                            }
                            return null;
                        case -1811142712:
                            if (p0.equals("kotlin.jvm.functions.Function14")) {
                                return "Function14";
                            }
                            return null;
                        case -1811142711:
                            if (p0.equals("kotlin.jvm.functions.Function15")) {
                                return "Function15";
                            }
                            return null;
                        case -1811142710:
                            if (p0.equals("kotlin.jvm.functions.Function16")) {
                                return "Function16";
                            }
                            return null;
                        case -1811142709:
                            if (p0.equals("kotlin.jvm.functions.Function17")) {
                                return "Function17";
                            }
                            return null;
                        case -1811142708:
                            if (p0.equals("kotlin.jvm.functions.Function18")) {
                                return "Function18";
                            }
                            return null;
                        case -1811142707:
                            if (p0.equals("kotlin.jvm.functions.Function19")) {
                                return "Function19";
                            }
                            return null;
                        default:
                            switch (iHashCode) {
                                case -1811142685:
                                    if (p0.equals("kotlin.jvm.functions.Function20")) {
                                        return "Function20";
                                    }
                                    return null;
                                case -1811142684:
                                    if (p0.equals("kotlin.jvm.functions.Function21")) {
                                        return "Function21";
                                    }
                                    return null;
                                case -1811142683:
                                    if (p0.equals("kotlin.jvm.functions.Function22")) {
                                        return "Function22";
                                    }
                                    return null;
                                default:
                                    switch (iHashCode) {
                                        case 80123371:
                                            if (p0.equals("kotlin.jvm.functions.Function0")) {
                                                return "Function0";
                                            }
                                            return null;
                                        case 80123372:
                                            if (p0.equals("kotlin.jvm.functions.Function1")) {
                                                return "Function1";
                                            }
                                            return null;
                                        case 80123373:
                                            if (p0.equals("kotlin.jvm.functions.Function2")) {
                                                return "Function2";
                                            }
                                            return null;
                                        case 80123374:
                                            if (p0.equals("kotlin.jvm.functions.Function3")) {
                                                return "Function3";
                                            }
                                            return null;
                                        case 80123375:
                                            if (p0.equals("kotlin.jvm.functions.Function4")) {
                                                return "Function4";
                                            }
                                            return null;
                                        case 80123376:
                                            if (p0.equals("kotlin.jvm.functions.Function5")) {
                                                return "Function5";
                                            }
                                            return null;
                                        case 80123377:
                                            if (p0.equals("kotlin.jvm.functions.Function6")) {
                                                return "Function6";
                                            }
                                            return null;
                                        case 80123378:
                                            if (p0.equals("kotlin.jvm.functions.Function7")) {
                                                return "Function7";
                                            }
                                            return null;
                                        case 80123379:
                                            if (p0.equals("kotlin.jvm.functions.Function8")) {
                                                return "Function8";
                                            }
                                            return null;
                                        case 80123380:
                                            if (p0.equals("kotlin.jvm.functions.Function9")) {
                                                return "Function9";
                                            }
                                            return null;
                                        default:
                                            return null;
                                    }
                            }
                    }
            }
        }

        public static String IconCompatParcelizer(Class<?> p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String string = null;
            if (p0.isAnonymousClass()) {
                return null;
            }
            if (p0.isLocalClass()) {
                String simpleName = p0.getSimpleName();
                Method enclosingMethod = p0.getEnclosingMethod();
                if (enclosingMethod != null) {
                    toMagicModuleMetaRepoModel.write((Object) simpleName);
                    StringBuilder sb = new StringBuilder();
                    sb.append(enclosingMethod.getName());
                    sb.append('$');
                    String str = TestGroupLSModel.read(simpleName, sb.toString(), simpleName);
                    if (str != null) {
                        return str;
                    }
                }
                Constructor<?> enclosingConstructor = p0.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    toMagicModuleMetaRepoModel.write((Object) simpleName);
                    return TestGroupLSModel.RemoteActionCompatParcelizer(simpleName, '$', simpleName);
                }
                toMagicModuleMetaRepoModel.write((Object) simpleName);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(enclosingConstructor.getName());
                sb2.append('$');
                return TestGroupLSModel.read(simpleName, sb2.toString(), simpleName);
            }
            if (p0.isArray()) {
                Class<?> componentType = p0.getComponentType();
                if (componentType.isPrimitive()) {
                    String name = componentType.getName();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
                    String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(name);
                    if (strRemoteActionCompatParcelizer != null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(strRemoteActionCompatParcelizer);
                        sb3.append("Array");
                        string = sb3.toString();
                    }
                }
                return string == null ? "Array" : string;
            }
            String name2 = p0.getName();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name2, "");
            String strRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(name2);
            return strRemoteActionCompatParcelizer2 == null ? p0.getSimpleName() : strRemoteActionCompatParcelizer2;
        }

        public static String AudioAttributesCompatParcelizer(Class<?> p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String string = null;
            if (p0.isAnonymousClass() || p0.isLocalClass()) {
                return null;
            }
            if (p0.isArray()) {
                Class<?> componentType = p0.getComponentType();
                if (componentType.isPrimitive()) {
                    String name = componentType.getName();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
                    String strIconCompatParcelizer = IconCompatParcelizer(name);
                    if (strIconCompatParcelizer != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(strIconCompatParcelizer);
                        sb.append("Array");
                        string = sb.toString();
                    }
                }
                return string == null ? "kotlin.Array" : string;
            }
            String name2 = p0.getName();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name2, "");
            String strIconCompatParcelizer2 = IconCompatParcelizer(name2);
            return strIconCompatParcelizer2 == null ? p0.getCanonicalName() : strIconCompatParcelizer2;
        }

        public static boolean RemoteActionCompatParcelizer(Object p0, Class<?> p1) {
            toMagicModuleMetaRepoModel.write(p1, "");
            Map map = markCompletelambda2.write;
            toMagicModuleMetaRepoModel.read(map, "");
            Integer num = (Integer) map.get(p1);
            if (num != null) {
                return toMagicModuleStatsLSModel.write(p0, num.intValue());
            }
            if (p1.isPrimitive()) {
                p1 = MagicModuleFeedbackRequestBody.write(MagicModuleFeedbackRequestBody.read(p1));
            }
            return p1.isInstance(p0);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        List listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Class[]{getCreatedOnDateMs.class, getAnswerMap.class, MagicModuleSubmissionRequestBody.class, getModuleData.class, getMagicModuleStat.class, MagicModuleRepository.class, markComplete.class, isDetailDownloaded.class, saveMagicModuleModule.class, MagicModuleRepositoryImpl.class, MagicModuleModel.class, getComment.class, getError_code.class, getMcqResponseList.class, toMagicModuleMetaLSModel.class, MagicModuleRSModelsKt.class, getMagicModuleRsStat.class, getCorrected.class, getNeedRevision.class, MagicModuleStatsRSModel.class, getModuleCompleted.class, MagicModuleTimelineRSModel.class, MagicModuleSubmissionResponseBody.class});
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listRemoteActionCompatParcelizer, 10));
        int i = 0;
        for (Object obj : listRemoteActionCompatParcelizer) {
            if (i < 0) {
                IntermediateLoginResponseBody.read();
            }
            arrayList.add(setAction.write((Class) obj, Integer.valueOf(i)));
            i++;
        }
        write = VideoTimelineResponseBody.read(arrayList);
    }
}
