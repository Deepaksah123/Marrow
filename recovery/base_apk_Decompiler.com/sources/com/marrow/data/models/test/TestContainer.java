package com.marrow.data.models.test;

import java.text.ParseException;
import java.util.Calendar;
import java.util.List;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.fromAdPlaybackState;
import kotlin.getMagicModuleMeta;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u0000 $*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001$B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u001e\u001a\u0004\u0018\u00018\u00008\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0012R\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0014"}, d2 = {"Lcom/marrow/data/models/test/TestContainer;", "T", "", "p0", "", "p1", "<init>", "(Ljava/lang/Object;I)V", "Lcom/marrow/data/models/test/Month;", "copyMonthItem", "(Lcom/marrow/data/models/test/Month;)Lcom/marrow/data/models/test/TestContainer;", "Lcom/marrow/data/models/test/ShowHideItems;", "copyShowHideItem", "(Lcom/marrow/data/models/test/ShowHideItems;)Lcom/marrow/data/models/test/TestContainer;", "Lcom/marrow/data/models/test/YearItem;", "copyYearItem", "(Lcom/marrow/data/models/test/YearItem;)Lcom/marrow/data/models/test/TestContainer;", "component1", "()Ljava/lang/Object;", "component2", "()I", "copy", "(Ljava/lang/Object;I)Lcom/marrow/data/models/test/TestContainer;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "item", "Ljava/lang/Object;", "getItem", "type", "I", "getType", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TestContainer<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int TYPE_GTA = 5;
    public static final int TYPE_MONTH_LIST = 1;
    public static final int TYPE_MONTH_STATUS = 2;
    public static final int TYPE_PREVIOUS_YEAR = 4;
    public static final int TYPE_SHOW_HIDE = 3;
    public static final int TYPE_YEAR_NAME = 6;
    private final T item;
    private final int type;

    public TestContainer(T t, int i) {
        this.item = t;
        this.type = i;
    }

    public final T getItem() {
        return this.item;
    }

    public final int getType() {
        return this.type;
    }

    public final TestContainer<T> copyMonthItem(Month p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return copy$default(this, p0, 0, 2, null);
    }

    public final TestContainer<T> copyShowHideItem(ShowHideItems p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return copy$default(this, p0, 0, 2, null);
    }

    public final TestContainer<T> copyYearItem(YearItem p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return copy$default(this, p0, 0, 2, null);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0005\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0005\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u0013\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0005\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019"}, d2 = {"Lcom/marrow/data/models/test/TestContainer$Companion;", "", "<init>", "()V", "", "p0", "p1", "", "Lcom/marrow/data/models/test/TestMini;", "p2", "Lcom/marrow/data/models/test/MonthType;", "p3", "", "p4", "Lcom/marrow/data/models/test/TestContainer;", "newMonthTestItem", "(IILjava/util/List;Lcom/marrow/data/models/test/MonthType;Z)Lcom/marrow/data/models/test/TestContainer;", "", "newHeaderTestItem", "(Ljava/lang/String;)Lcom/marrow/data/models/test/TestContainer;", "newPrevYearTestContainer", "newGtaInstance", "()Lcom/marrow/data/models/test/TestContainer;", "newYearNameItem", "TYPE_MONTH_LIST", "I", "TYPE_MONTH_STATUS", "TYPE_SHOW_HIDE", "TYPE_PREVIOUS_YEAR", "TYPE_GTA", "TYPE_YEAR_NAME"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ TestContainer newMonthTestItem$default(Companion companion, int i, int i2, List list, MonthType monthType, boolean z, int i3, Object obj) {
            if ((i3 & 8) != 0) {
                monthType = MonthType.PREVIOUS;
            }
            MonthType monthType2 = monthType;
            if ((i3 & 16) != 0) {
                z = false;
            }
            return companion.newMonthTestItem(i, i2, list, monthType2, z);
        }

        @getMagicModuleMeta
        public final TestContainer<?> newMonthTestItem(int p0, int p1, List<TestMini> p2, MonthType p3, boolean p4) throws ParseException {
            String string;
            toMagicModuleMetaRepoModel.write(p2, "");
            toMagicModuleMetaRepoModel.write(p3, "");
            int i = Calendar.getInstance().get(1);
            if (p3 == MonthType.UPCOMING && i != p1) {
                fromAdPlaybackState fromadplaybackstate = fromAdPlaybackState.read;
                String str = fromAdPlaybackState.RemoteActionCompatParcelizer()[p0];
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" ");
                sb.append(p1);
                string = sb.toString();
            } else {
                fromAdPlaybackState fromadplaybackstate2 = fromAdPlaybackState.read;
                string = fromAdPlaybackState.RemoteActionCompatParcelizer()[p0];
            }
            String str2 = string;
            toMagicModuleMetaRepoModel.write((Object) str2);
            fromAdPlaybackState fromadplaybackstate3 = fromAdPlaybackState.read;
            long jWrite = fromAdPlaybackState.write(p0 + 1, p1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(p0);
            sb2.append("-");
            sb2.append(p1);
            return new TestContainer<>(new Month(str2, p2, p4, jWrite, sb2.toString(), p3), 1);
        }

        @getMagicModuleMeta
        public final TestContainer<?> newHeaderTestItem(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new TestContainer<>(new SubHeader(p0, p0), 2);
        }

        @getMagicModuleMeta
        public final TestContainer<?> newPrevYearTestContainer(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new TestContainer<>(new SubHeader(p0, "YEAR ".concat(String.valueOf(p0))), 4);
        }

        @getMagicModuleMeta
        public final TestContainer<?> newGtaInstance() {
            return new TestContainer<>(new SubHeader("GTA", "GTA"), 5);
        }

        @getMagicModuleMeta
        public final TestContainer<?> newYearNameItem(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new TestContainer<>(new YearItem(p0, "Year ".concat(String.valueOf(p0)), false, 4, null), 6);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        @getMagicModuleMeta
        public final TestContainer<?> newMonthTestItem(int i, int i2, List<TestMini> list) {
            toMagicModuleMetaRepoModel.write(list, "");
            return newMonthTestItem$default(this, i, i2, list, null, false, 24, null);
        }

        @getMagicModuleMeta
        public final TestContainer<?> newMonthTestItem(int i, int i2, List<TestMini> list, MonthType monthType) {
            toMagicModuleMetaRepoModel.write(list, "");
            toMagicModuleMetaRepoModel.write(monthType, "");
            return newMonthTestItem$default(this, i, i2, list, monthType, false, 16, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TestContainer copy$default(TestContainer testContainer, Object obj, int i, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = testContainer.item;
        }
        if ((i2 & 2) != 0) {
            i = testContainer.type;
        }
        return testContainer.copy(obj, i);
    }

    @getMagicModuleMeta
    public static final TestContainer<?> newGtaInstance() {
        return INSTANCE.newGtaInstance();
    }

    @getMagicModuleMeta
    public static final TestContainer<?> newHeaderTestItem(String str) {
        return INSTANCE.newHeaderTestItem(str);
    }

    @getMagicModuleMeta
    public static final TestContainer<?> newMonthTestItem(int i, int i2, List<TestMini> list) {
        return INSTANCE.newMonthTestItem(i, i2, list);
    }

    @getMagicModuleMeta
    public static final TestContainer<?> newMonthTestItem(int i, int i2, List<TestMini> list, MonthType monthType) {
        return INSTANCE.newMonthTestItem(i, i2, list, monthType);
    }

    @getMagicModuleMeta
    public static final TestContainer<?> newMonthTestItem(int i, int i2, List<TestMini> list, MonthType monthType, boolean z) {
        return INSTANCE.newMonthTestItem(i, i2, list, monthType, z);
    }

    @getMagicModuleMeta
    public static final TestContainer<?> newPrevYearTestContainer(String str) {
        return INSTANCE.newPrevYearTestContainer(str);
    }

    @getMagicModuleMeta
    public static final TestContainer<?> newYearNameItem(String str) {
        return INSTANCE.newYearNameItem(str);
    }

    public final T component1() {
        return this.item;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final TestContainer<T> copy(T p0, int p1) {
        return new TestContainer<>(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TestContainer)) {
            return false;
        }
        TestContainer testContainer = (TestContainer) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.item, testContainer.item) && this.type == testContainer.type;
    }

    public final int hashCode() {
        T t = this.item;
        return ((t == null ? 0 : t.hashCode()) * 31) + Integer.hashCode(this.type);
    }

    public final String toString() {
        T t = this.item;
        int i = this.type;
        StringBuilder sb = new StringBuilder("TestContainer(item=");
        sb.append(t);
        sb.append(", type=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
