package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.newMonthTestItem;
import kotlin.newPrevYearTestContainer;

/* JADX INFO: loaded from: classes4.dex */
final class newMonthTestItem implements newPrevYearTestContainer {
    private final Matcher AudioAttributesCompatParcelizer;
    private List<String> IconCompatParcelizer;
    private final newHeaderTestItem read;
    private final CharSequence write;

    public newMonthTestItem(Matcher matcher, CharSequence charSequence) {
        toMagicModuleMetaRepoModel.write(matcher, "");
        toMagicModuleMetaRepoModel.write(charSequence, "");
        this.AudioAttributesCompatParcelizer = matcher;
        this.write = charSequence;
        this.read = new write();
    }

    @Override // kotlin.newPrevYearTestContainer
    public final newPrevYearTestContainer.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer() {
        return newPrevYearTestContainer.read.write(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.newPrevYearTestContainer
    public final newEncryptedObject read() {
        return TestContainerCompanion.write(AudioAttributesImplApi21Parcelizer());
    }

    public static final class write extends setBigButtonText<setTestBeginTimestamp> implements copyMonthItem {
        @Override // kotlin.setBigButtonText, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        write() {
        }

        private boolean read(setTestBeginTimestamp settestbegintimestamp) {
            return super.contains(settestbegintimestamp);
        }

        @Override // kotlin.setBigButtonText, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (obj == null || (obj instanceof setTestBeginTimestamp)) {
                return read((setTestBeginTimestamp) obj);
            }
            return false;
        }

        @Override // kotlin.setBigButtonText
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
        public final int getWrite() {
            return newMonthTestItem.this.AudioAttributesImplApi21Parcelizer().groupCount() + 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final setTestBeginTimestamp read(write writeVar, int i) {
            return writeVar.RemoteActionCompatParcelizer(i);
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<setTestBeginTimestamp> iterator() {
            return StateResult.write(IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer(IntermediateLoginResponseBody.read((Collection<?>) this)), new getAnswerMap() { // from class: o.copyShowHideItem
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return newMonthTestItem.write.read(this.IconCompatParcelizer, ((Integer) obj).intValue());
                }
            }).write();
        }

        @Override // kotlin.newHeaderTestItem
        public final setTestBeginTimestamp RemoteActionCompatParcelizer(int i) {
            newEncryptedObject newencryptedobjectWrite = TestContainerCompanion.write(newMonthTestItem.this.AudioAttributesImplApi21Parcelizer(), i);
            if (newencryptedobjectWrite.write().intValue() < 0) {
                return null;
            }
            String strGroup = newMonthTestItem.this.AudioAttributesImplApi21Parcelizer().group(i);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strGroup, "");
            return new setTestBeginTimestamp(strGroup, newencryptedobjectWrite);
        }
    }

    @Override // kotlin.newPrevYearTestContainer
    public final newHeaderTestItem RemoteActionCompatParcelizer() {
        return this.read;
    }

    public static final class read extends setUrl<String> {
        read() {
        }

        private boolean RemoteActionCompatParcelizer(String str) {
            return super.contains(str);
        }

        private int read(String str) {
            return super.indexOf(str);
        }

        private int write(String str) {
            return super.lastIndexOf(str);
        }

        @Override // kotlin.setBigButtonText, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (obj instanceof String) {
                return RemoteActionCompatParcelizer((String) obj);
            }
            return false;
        }

        @Override // kotlin.setUrl, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof String) {
                return read((String) obj);
            }
            return -1;
        }

        @Override // kotlin.setUrl, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return write((String) obj);
            }
            return -1;
        }

        @Override // kotlin.setBigButtonText
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
        public final int getWrite() {
            return newMonthTestItem.this.AudioAttributesImplApi21Parcelizer().groupCount() + 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.setUrl, java.util.List
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public String get(int i) {
            String strGroup = newMonthTestItem.this.AudioAttributesImplApi21Parcelizer().group(i);
            return strGroup == null ? "" : strGroup;
        }
    }

    @Override // kotlin.newPrevYearTestContainer
    public final List<String> write() {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new read();
        }
        List<String> list = this.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(list);
        return list;
    }

    @Override // kotlin.newPrevYearTestContainer
    public final newPrevYearTestContainer IconCompatParcelizer() {
        int iEnd = AudioAttributesImplApi21Parcelizer().end() + (AudioAttributesImplApi21Parcelizer().end() == AudioAttributesImplApi21Parcelizer().start() ? 1 : 0);
        if (iEnd > this.write.length()) {
            return null;
        }
        Matcher matcher = this.AudioAttributesCompatParcelizer.pattern().matcher(this.write);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(matcher, "");
        return TestContainerCompanion.RemoteActionCompatParcelizer(matcher, iEnd, this.write);
    }
}
