package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface newPrevYearTestContainer {
    RemoteActionCompatParcelizer AudioAttributesCompatParcelizer();

    newPrevYearTestContainer IconCompatParcelizer();

    newHeaderTestItem RemoteActionCompatParcelizer();

    newEncryptedObject read();

    List<String> write();

    public static final class read {
        public static RemoteActionCompatParcelizer write(newPrevYearTestContainer newprevyeartestcontainer) {
            return new RemoteActionCompatParcelizer(newprevyeartestcontainer);
        }
    }

    public static final class RemoteActionCompatParcelizer {
        private final newPrevYearTestContainer write;

        public RemoteActionCompatParcelizer(newPrevYearTestContainer newprevyeartestcontainer) {
            toMagicModuleMetaRepoModel.write(newprevyeartestcontainer, "");
            this.write = newprevyeartestcontainer;
        }

        public final newPrevYearTestContainer IconCompatParcelizer() {
            return this.write;
        }
    }
}
