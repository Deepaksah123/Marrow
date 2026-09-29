package kotlin;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 52\u00060\u0001j\u0002`\u0002:\u000245B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\fB\u001f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0004\b\u0005\u0010\u000fJ\u0011\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0086\u0004J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001f2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010 \u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u0018J\u001a\u0010!\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001dH\u0007J\u0018\u0010#\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001dH\u0007J\u0016\u0010$\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\bJ\"\u0010$\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00180'J\u0016\u0010(\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\bJ\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0*2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010+\u001a\u00020\u001dJ \u0010,\u001a\b\u0012\u0004\u0012\u00020\b0\u001f2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010+\u001a\u00020\u001dH\u0007J\b\u0010-\u001a\u00020\bH\u0016J\u0006\u0010.\u001a\u00020\u0004J\b\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u0002022\u0006\u0010\u0017\u001a\u000203H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u00066"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "nativePattern", "Ljava/util/regex/Pattern;", "<init>", "(Ljava/util/regex/Pattern;)V", "pattern", "", "(Ljava/lang/String;)V", "option", "Lkotlin/text/RegexOption;", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "options", "", "(Ljava/lang/String;Ljava/util/Set;)V", "getPattern", "()Ljava/lang/String;", "_options", "getOptions", "()Ljava/util/Set;", "matches", "", "input", "", "containsMatchIn", "find", "Lkotlin/text/MatchResult;", "startIndex", "", "findAll", "Lkotlin/sequences/Sequence;", "matchEntire", "matchAt", "index", "matchesAt", "replace", "replacement", "transform", "Lkotlin/Function1;", "replaceFirst", "split", "", "limit", "splitToSequence", "toString", "toPattern", "writeReplace", "", "readObject", "", "Ljava/io/ObjectInputStream;", "Serialized", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class newYearNameItem implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Set<? extends copyYearItem> _options;
    private final Pattern nativePattern;

    public newYearNameItem(Pattern pattern) {
        toMagicModuleMetaRepoModel.write(pattern, "");
        this.nativePattern = pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public newYearNameItem(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        Pattern patternCompile = Pattern.compile(str);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(patternCompile, "");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public newYearNameItem(String str, copyYearItem copyyearitem) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(copyyearitem, "");
        Pattern patternCompile = Pattern.compile(str, Companion.IconCompatParcelizer(copyyearitem.getValue()));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(patternCompile, "");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public newYearNameItem(String str, Set<? extends copyYearItem> set) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(set, "");
        Pattern patternCompile = Pattern.compile(str, Companion.IconCompatParcelizer(TestContainerCompanion.IconCompatParcelizer((Iterable<? extends setSubmissionTimestamp>) set)));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(patternCompile, "");
        this(patternCompile);
    }

    public final boolean write(CharSequence charSequence) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        return this.nativePattern.matcher(charSequence).matches();
    }

    public final boolean AudioAttributesCompatParcelizer(CharSequence charSequence) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        return this.nativePattern.matcher(charSequence).find();
    }

    public static /* synthetic */ newPrevYearTestContainer read(newYearNameItem newyearnameitem, CharSequence charSequence) {
        return newyearnameitem.AudioAttributesCompatParcelizer(charSequence, 0);
    }

    private newPrevYearTestContainer AudioAttributesCompatParcelizer(CharSequence charSequence, int i) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(matcher, "");
        return TestContainerCompanion.RemoteActionCompatParcelizer(matcher, i, charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public getTopRankers<newPrevYearTestContainer> read(final CharSequence charSequence, int i) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        if (charSequence.length() < 0) {
            StringBuilder sb = new StringBuilder("Start index out of bounds: 0");
            sb.append(", input length: ");
            sb.append(charSequence.length());
            throw new IndexOutOfBoundsException(sb.toString());
        }
        final int i2 = 0;
        return StateResult.AudioAttributesCompatParcelizer(new getCreatedOnDateMs() { // from class: o.getItem
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return newYearNameItem.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, charSequence, i2);
            }
        }, AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class AudioAttributesCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<newPrevYearTestContainer, newPrevYearTestContainer> {
        public static final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final newPrevYearTestContainer invoke(newPrevYearTestContainer newprevyeartestcontainer) {
            toMagicModuleMetaRepoModel.write(newprevyeartestcontainer, "");
            return newprevyeartestcontainer.IconCompatParcelizer();
        }

        AudioAttributesCompatParcelizer() {
            super(1, newPrevYearTestContainer.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final newPrevYearTestContainer AudioAttributesCompatParcelizer(newYearNameItem newyearnameitem, CharSequence charSequence, int i) {
        return newyearnameitem.AudioAttributesCompatParcelizer(charSequence, i);
    }

    public final newPrevYearTestContainer RemoteActionCompatParcelizer(CharSequence charSequence) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(matcher, "");
        return TestContainerCompanion.write(matcher, charSequence);
    }

    public final String RemoteActionCompatParcelizer(CharSequence charSequence, String str) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(str, "");
        String strReplaceAll = this.nativePattern.matcher(charSequence).replaceAll(str);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strReplaceAll, "");
        return strReplaceAll;
    }

    public final String RemoteActionCompatParcelizer(CharSequence charSequence, getAnswerMap<? super newPrevYearTestContainer, ? extends CharSequence> getanswermap) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        newPrevYearTestContainer newprevyeartestcontainerIconCompatParcelizer = read(this, charSequence);
        if (newprevyeartestcontainerIconCompatParcelizer == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int iIntValue = 0;
        do {
            sb.append(charSequence, iIntValue, newprevyeartestcontainerIconCompatParcelizer.read().write().intValue());
            sb.append(getanswermap.invoke(newprevyeartestcontainerIconCompatParcelizer));
            iIntValue = newprevyeartestcontainerIconCompatParcelizer.read().IconCompatParcelizer().intValue() + 1;
            newprevyeartestcontainerIconCompatParcelizer = newprevyeartestcontainerIconCompatParcelizer.IconCompatParcelizer();
            if (iIntValue >= length) {
                break;
            }
        } while (newprevyeartestcontainerIconCompatParcelizer != null);
        if (iIntValue < length) {
            sb.append(charSequence, iIntValue, length);
        }
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    public final String AudioAttributesCompatParcelizer(CharSequence charSequence, String str) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(str, "");
        String strReplaceFirst = this.nativePattern.matcher(charSequence).replaceFirst(str);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strReplaceFirst, "");
        return strReplaceFirst;
    }

    public final List<String> read(CharSequence charSequence) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        int iEnd = 0;
        TestGroupLSModel.write(0);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (!matcher.find()) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String string = this.nativePattern.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    private final Object writeReplace() {
        String strPattern = this.nativePattern.pattern();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strPattern, "");
        return new write(strPattern, this.nativePattern.flags());
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \u000f2\u00060\u0001j\u0002`\u0002:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "flags", "", "<init>", "(Ljava/lang/String;I)V", "getPattern", "()Ljava/lang/String;", "getFlags", "()I", "readResolve", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class write implements Serializable {
        public static final C0125write read = new C0125write(null);
        private final int IconCompatParcelizer;
        private final String write;

        /* JADX INFO: renamed from: o.newYearNameItem$write$write, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/newYearNameItem$write$write;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0125write {
            private C0125write() {
            }

            public /* synthetic */ C0125write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this();
            }
        }

        public write(String str, int i) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.write = str;
            this.IconCompatParcelizer = i;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.write, this.IconCompatParcelizer);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(patternCompile, "");
            return new newYearNameItem(patternCompile);
        }
    }

    /* JADX INFO: renamed from: o.newYearNameItem$read, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/newYearNameItem$read;", "", "<init>", "()V", "", "p0", "IconCompatParcelizer", "(I)I"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public static int IconCompatParcelizer(int p0) {
            return (p0 & 2) != 0 ? p0 | 64 : p0;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
