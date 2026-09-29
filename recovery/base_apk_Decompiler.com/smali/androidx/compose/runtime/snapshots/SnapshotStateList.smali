###### Class androidx.compose.runtime.snapshots.SnapshotStateList (androidx.compose.runtime.snapshots.SnapshotStateList)
.class public final Landroidx/compose/runtime/snapshots/SnapshotStateList;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lo/tryMatch;
.implements Ljava/util/List;
.implements Ljava/util/RandomAccess;
.implements Lo/getModulesCompleted;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/runtime/snapshots/SnapshotStateList$RemoteActionCompatParcelizer;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable;",
        "Lo/tryMatch;",
        "Ljava/util/List<",
        "TT;>;",
        "Ljava/util/RandomAccess;",
        "Lo/getModulesCompleted;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u001e\n\u0002\u0008\u0007\n\u0002\u0010)\n\u0002\u0008\u0002\n\u0002\u0010+\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 H*\u0004\u0008\u0000\u0010\u00012\u00020\u00022\u00020\u00032\u0008\u0012\u0004\u0012\u0002H\u00010\u00042\u00060\u0005j\u0002`\u0006:\u0001HB\u0017\u0008\u0000\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008\u00a2\u0006\u0004\u0008\t\u0010\nB\t\u0008\u0016\u00a2\u0006\u0004\u0008\t\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000c\u001a\u00020\rH\u0016J\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0014J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u001a2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001fH\u0016J\u0016\u0010 \u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u0016H\u0096\u0002\u00a2\u0006\u0002\u0010\"J\u0015\u0010#\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010$J\u0008\u0010%\u001a\u00020\u001aH\u0016J\u000f\u0010&\u001a\u0008\u0012\u0004\u0012\u00028\u00000\'H\u0096\u0002J\u0015\u0010(\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010$J\u000e\u0010)\u001a\u0008\u0012\u0004\u0012\u00028\u00000*H\u0016J\u0016\u0010)\u001a\u0008\u0012\u0004\u0012\u00028\u00000*2\u0006\u0010!\u001a\u00020\u0016H\u0016J\u001e\u0010+\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0016H\u0016J\u0008\u0010.\u001a\u00020/H\u0016J\u0015\u00100\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001cJ\u001d\u00100\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u00101J\u001e\u00102\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u00162\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001fH\u0016J\u0016\u00102\u001a\u00020\u001a2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001fH\u0016J\u0008\u00103\u001a\u00020\u0012H\u0016J\u0015\u00104\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001cJ\u0016\u00105\u001a\u00020\u001a2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001fH\u0016J\u0015\u00106\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u0016H\u0016\u00a2\u0006\u0002\u0010\"J\u0016\u00107\u001a\u00020\u001a2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001fH\u0016J\u001e\u00108\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0002\u00109J\u0016\u0010:\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0016J+\u0010;\u001a\u00020\u00162\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010<\u001a\u00020\u00162\u0006\u0010=\u001a\u00020\u0016H\u0000\u00a2\u0006\u0002\u0008>J\u0018\u0010C\u001a\u00020\u00122\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u0016H\u0016J\u0008\u0010G\u001a\u00020\u0016H\u0016R\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\r@RX\u0096\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R \u0010?\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00148AX\u0080\u0004\u00a2\u0006\u000c\u0012\u0004\u0008@\u0010\u000b\u001a\u0004\u0008A\u0010B\u00a8\u0006I"
    }
    d2 = {
        "Landroidx/compose/runtime/snapshots/SnapshotStateList;",
        "T",
        "Landroid/os/Parcelable;",
        "Landroidx/compose/runtime/snapshots/StateObject;",
        "",
        "Ljava/util/RandomAccess;",
        "Lkotlin/collections/RandomAccess;",
        "persistentList",
        "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;",
        "<init>",
        "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V",
        "()V",
        "value",
        "Landroidx/compose/runtime/snapshots/StateRecord;",
        "firstStateRecord",
        "getFirstStateRecord",
        "()Landroidx/compose/runtime/snapshots/StateRecord;",
        "prependStateRecord",
        "",
        "toList",
        "",
        "size",
        "",
        "getSize",
        "()I",
        "contains",
        "",
        "element",
        "(Ljava/lang/Object;)Z",
        "containsAll",
        "elements",
        "",
        "get",
        "index",
        "(I)Ljava/lang/Object;",
        "indexOf",
        "(Ljava/lang/Object;)I",
        "isEmpty",
        "iterator",
        "",
        "lastIndexOf",
        "listIterator",
        "",
        "subList",
        "fromIndex",
        "toIndex",
        "toString",
        "",
        "add",
        "(ILjava/lang/Object;)V",
        "addAll",
        "clear",
        "remove",
        "removeAll",
        "removeAt",
        "retainAll",
        "set",
        "(ILjava/lang/Object;)Ljava/lang/Object;",
        "removeRange",
        "retainAllInRange",
        "start",
        "end",
        "retainAllInRange$runtime",
        "debuggerDisplayValue",
        "getDebuggerDisplayValue$annotations",
        "getDebuggerDisplayValue",
        "()Ljava/util/List;",
        "writeToParcel",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "describeContents",
        "Companion",
        "runtime"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final IconCompatParcelizer:Landroidx/compose/runtime/snapshots/SnapshotStateList$RemoteActionCompatParcelizer;


# instance fields
.field private RemoteActionCompatParcelizer:Lo/reportWeirdUCS4;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$RemoteActionCompatParcelizer;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList$RemoteActionCompatParcelizer;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    sput-object v0, Landroidx/compose/runtime/snapshots/SnapshotStateList;->IconCompatParcelizer:Landroidx/compose/runtime/snapshots/SnapshotStateList$RemoteActionCompatParcelizer;

    .line 171
    new-instance v0, Landroidx/compose/runtime/snapshots/SnapshotStateList$AudioAttributesCompatParcelizer;

    invoke-direct {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList$AudioAttributesCompatParcelizer;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Landroidx/compose/runtime/snapshots/SnapshotStateList;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    .line 43
    invoke-static {}, Lo/reportStrangeStream;->read()Lo/AbstractFloatValueParser;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;-><init>(Lo/AbstractFloatValueParser;)V

    return-void
.end method

.method public constructor <init>(Lo/AbstractFloatValueParser;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/AbstractFloatValueParser<",
            "+TT;>;)V"
        }
    .end annotation

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    invoke-static {p0, p1}, Lo/flog10threeQuartersPow2;->IconCompatParcelizer(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lo/AbstractFloatValueParser;)Lo/reportWeirdUCS4;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateList;->RemoteActionCompatParcelizer:Lo/reportWeirdUCS4;

    return-void
.end method

.method private static final AudioAttributesCompatParcelizer(ILjava/util/Collection;Ljava/util/List;)Z
    .registers 3

    .line 112
    invoke-interface {p2, p0, p1}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result p0

    return p0
.end method

.method public static synthetic AudioAttributesCompatParcelizer(Ljava/util/Collection;Ljava/util/List;)Z
    .registers 2

    .line 533
    invoke-static {p0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->IconCompatParcelizer(Ljava/util/Collection;Ljava/util/List;)Z

    move-result p0

    return p0
.end method

.method private static final IconCompatParcelizer(Ljava/util/Collection;Ljava/util/List;)Z
    .registers 2

    .line 130
    invoke-interface {p1, p0}, Ljava/util/List;->retainAll(Ljava/util/Collection;)Z

    move-result p0

    return p0
.end method

.method public static synthetic write(ILjava/util/Collection;Ljava/util/List;)Z
    .registers 3

    .line 532
    invoke-static {p0, p1, p2}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->AudioAttributesCompatParcelizer(ILjava/util/Collection;Ljava/util/List;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()I
    .registers 1

    .line 72
    invoke-static {p0}, Lo/flog10threeQuartersPow2;->RemoteActionCompatParcelizer(Landroidx/compose/runtime/snapshots/SnapshotStateList;)Lo/checkUTF16;

    move-result-object p0

    invoke-virtual {p0}, Lo/checkUTF16;->read()Lo/AbstractFloatValueParser;

    move-result-object p0

    invoke-interface {p0}, Lo/AbstractFloatValueParser;->size()I

    move-result p0

    return p0
.end method

.method public final AudioAttributesCompatParcelizer(II)V
    .registers 10

    .line 480
    :cond_0
    invoke-static {}, Lo/flog10threeQuartersPow2;->IconCompatParcelizer()Ljava/lang/Object;

    move-result-object v0

    .line 481
    monitor-enter v0

    .line 483
    :try_start_5
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->write()Lo/reportWeirdUCS4;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lo/checkUTF16;

    check-cast v1, Lo/reportWeirdUCS4;

    .line 484
    invoke-static {v1}, Lo/toChars3;->IconCompatParcelizer(Lo/reportWeirdUCS4;)Lo/reportWeirdUCS4;

    move-result-object v1

    check-cast v1, Lo/checkUTF16;

    .line 485
    invoke-virtual {v1}, Lo/checkUTF16;->write()I

    move-result v2

    .line 486
    invoke-virtual {v1}, Lo/checkUTF16;->read()Lo/AbstractFloatValueParser;

    move-result-object v1

    .line 487
    sget-object v3, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;
    :try_end_22
    .catchall {:try_start_5 .. :try_end_22} :catchall_71

    .line 481
    monitor-exit v0

    .line 488
    invoke-static {v1}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    invoke-interface {v1}, Lo/AbstractFloatValueParser;->RemoteActionCompatParcelizer()Lo/AbstractFloatValueParser$AudioAttributesCompatParcelizer;

    move-result-object v0

    .line 489
    move-object v3, v0

    check-cast v3, Ljava/util/List;

    .line 137
    invoke-interface {v3, p1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->clear()V

    sget-object v3, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    .line 490
    invoke-interface {v0}, Lo/AbstractFloatValueParser$AudioAttributesCompatParcelizer;->IconCompatParcelizer()Lo/AbstractFloatValueParser;

    move-result-object v0

    .line 492
    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_70

    .line 494
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->write()Lo/reportWeirdUCS4;

    move-result-object v1

    const-string v3, ""

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lo/checkUTF16;

    check-cast v1, Lo/reportWeirdUCS4;

    move-object v3, p0

    check-cast v3, Lo/tryMatch;

    .line 497
    invoke-static {}, Lo/toChars3;->MediaBrowserCompatMediaItem()Ljava/lang/Object;

    move-result-object v4

    .line 481
    monitor-enter v4

    .line 498
    :try_start_55
    sget-object v5, Lo/parseDigitsRecursive;->AudioAttributesCompatParcelizer:Lo/parseDigitsRecursive$AudioAttributesCompatParcelizer;

    invoke-virtual {v5}, Lo/parseDigitsRecursive$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()Lo/parseDigitsRecursive;

    move-result-object v5

    .line 499
    invoke-static {v1, v3, v5}, Lo/toChars3;->IconCompatParcelizer(Lo/reportWeirdUCS4;Lo/tryMatch;Lo/parseDigitsRecursive;)Lo/reportWeirdUCS4;

    move-result-object v1

    check-cast v1, Lo/checkUTF16;

    const/4 v6, 0x1

    .line 493
    invoke-static {v1, v2, v0, v6}, Lo/flog10threeQuartersPow2;->AudioAttributesCompatParcelizer(Lo/checkUTF16;ILo/AbstractFloatValueParser;Z)Z

    move-result v0
    :try_end_66
    .catchall {:try_start_55 .. :try_end_66} :catchall_6d

    .line 481
    monitor-exit v4

    .line 501
    invoke-static {v5, v3}, Lo/toChars3;->AudioAttributesCompatParcelizer(Lo/parseDigitsRecursive;Lo/tryMatch;)V

    if-eqz v0, :cond_0

    return-void

    :catchall_6d
    move-exception p0

    .line 481
    monitor-exit v4

    throw p0

    :cond_70
    return-void

    :catchall_71
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public final RemoteActionCompatParcelizer(Ljava/util/Collection;II)I
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TT;>;II)I"
        }
    .end annotation

    .line 141
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    move-result v0

    .line 510
    :cond_4
    invoke-static {}, Lo/flog10threeQuartersPow2;->IconCompatParcelizer()Ljava/lang/Object;

    move-result-object v1

    .line 511
    monitor-enter v1

    .line 513
    :try_start_9
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->write()Lo/reportWeirdUCS4;

    move-result-object v2

    const-string v3, ""

    invoke-static {v2, v3}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lo/checkUTF16;

    check-cast v2, Lo/reportWeirdUCS4;

    .line 514
    invoke-static {v2}, Lo/toChars3;->IconCompatParcelizer(Lo/reportWeirdUCS4;)Lo/reportWeirdUCS4;

    move-result-object v2

    check-cast v2, Lo/checkUTF16;

    .line 515
    invoke-virtual {v2}, Lo/checkUTF16;->write()I

    move-result v3

    .line 516
    invoke-virtual {v2}, Lo/checkUTF16;->read()Lo/AbstractFloatValueParser;

    move-result-object v2

    .line 517
    sget-object v4, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;
    :try_end_26
    .catchall {:try_start_9 .. :try_end_26} :catchall_7a

    .line 511
    monitor-exit v1

    .line 518
    invoke-static {v2}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    invoke-interface {v2}, Lo/AbstractFloatValueParser;->RemoteActionCompatParcelizer()Lo/AbstractFloatValueParser$AudioAttributesCompatParcelizer;

    move-result-object v1

    .line 519
    move-object v4, v1

    check-cast v4, Ljava/util/List;

    .line 142
    invoke-interface {v4, p2, p3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, p1}, Ljava/util/List;->retainAll(Ljava/util/Collection;)Z

    sget-object v4, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;

    .line 520
    invoke-interface {v1}, Lo/AbstractFloatValueParser$AudioAttributesCompatParcelizer;->IconCompatParcelizer()Lo/AbstractFloatValueParser;

    move-result-object v1

    .line 522
    invoke-static {v1, v2}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_74

    .line 524
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->write()Lo/reportWeirdUCS4;

    move-result-object v2

    const-string v4, ""

    invoke-static {v2, v4}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lo/checkUTF16;

    check-cast v2, Lo/reportWeirdUCS4;

    move-object v4, p0

    check-cast v4, Lo/tryMatch;

    .line 527
    invoke-static {}, Lo/toChars3;->MediaBrowserCompatMediaItem()Ljava/lang/Object;

    move-result-object v5

    .line 511
    monitor-enter v5

    .line 528
    :try_start_59
    sget-object v6, Lo/parseDigitsRecursive;->AudioAttributesCompatParcelizer:Lo/parseDigitsRecursive$AudioAttributesCompatParcelizer;

    invoke-virtual {v6}, Lo/parseDigitsRecursive$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()Lo/parseDigitsRecursive;

    move-result-object v6

    .line 529
    invoke-static {v2, v4, v6}, Lo/toChars3;->IconCompatParcelizer(Lo/reportWeirdUCS4;Lo/tryMatch;Lo/parseDigitsRecursive;)Lo/reportWeirdUCS4;

    move-result-object v2

    check-cast v2, Lo/checkUTF16;

    const/4 v7, 0x1

    .line 523
    invoke-static {v2, v3, v1, v7}, Lo/flog10threeQuartersPow2;->AudioAttributesCompatParcelizer(Lo/checkUTF16;ILo/AbstractFloatValueParser;Z)Z

    move-result v1
    :try_end_6a
    .catchall {:try_start_59 .. :try_end_6a} :catchall_71

    .line 511
    monitor-exit v5

    .line 531
    invoke-static {v6, v4}, Lo/toChars3;->AudioAttributesCompatParcelizer(Lo/parseDigitsRecursive;Lo/tryMatch;)V

    if-eqz v1, :cond_4

    goto :goto_74

    :catchall_71
    move-exception p0

    .line 511
    monitor-exit v5

    throw p0

    .line 143
    :cond_74
    :goto_74
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    move-result p0

    sub-int/2addr v0, p0

    return v0

    :catchall_7a
    move-exception p0

    .line 511
    monitor-exit v1

    throw p0
.end method

.method public final RemoteActionCompatParcelizer()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 69
    invoke-static {p0}, Lo/flog10threeQuartersPow2;->RemoteActionCompatParcelizer(Landroidx/compose/runtime/snapshots/SnapshotStateList;)Lo/checkUTF16;

    move-result-object p0

    invoke-virtual {p0}, Lo/checkUTF16;->read()Lo/AbstractFloatValueParser;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer(Lo/reportWeirdUCS4;)V
    .registers 3

    .line 49
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->write()Lo/reportWeirdUCS4;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/reportWeirdUCS4;->RemoteActionCompatParcelizer(Lo/reportWeirdUCS4;)V

    .line 51
    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lo/checkUTF16;

    check-cast p1, Lo/reportWeirdUCS4;

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateList;->RemoteActionCompatParcelizer:Lo/reportWeirdUCS4;

    return-void
.end method

.method public final add(ILjava/lang/Object;)V
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)V"
        }
    .end annotation

    .line 236
    move-object v0, p0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 241
    :cond_3
    invoke-static {}, Lo/flog10threeQuartersPow2;->IconCompatParcelizer()Ljava/lang/Object;

    move-result-object v0

    .line 242
    monitor-enter v0

    .line 244
    :try_start_8
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->write()Lo/reportWeirdUCS4;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lo/checkUTF16;

    check-cast v1, Lo/reportWeirdUCS4;

    .line 245
    invoke-static {v1}, Lo/toChars3;->IconCompatParcelizer(Lo/reportWeirdUCS4;)Lo/reportWeirdUCS4;

    move-result-object v1

    check-cast v1, Lo/checkUTF16;

    .line 246
    invoke-virtual {v1}, Lo/checkUTF16;->write()I

    move-result v2

    .line 247
    invoke-virtual {v1}, Lo/checkUTF16;->read()Lo/AbstractFloatValueParser;

    move-result-object v1

    .line 248
    sget-object v3, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;
    :try_end_25
    .catchall {:try_start_8 .. :try_end_25} :catchall_64

    .line 242
    monitor-exit v0

    .line 249
    invoke-static {v1}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    .line 109
    invoke-interface {v1, p1, p2}, Lo/AbstractFloatValueParser;->read(ILjava/lang/Object;)Lo/AbstractFloatValueParser;

    move-result-object v0

    .line 250
    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_34

    return-void

    .line 255
    :cond_34
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->write()Lo/reportWeirdUCS4;

    move-result-object v1

    const-string v3, ""

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lo/checkUTF16;

    check-cast v1, Lo/reportWeirdUCS4;

    move-object v3, p0

    check-cast v3, Lo/tryMatch;

    .line 258
    invoke-static {}, Lo/toChars3;->MediaBrowserCompatMediaItem()Ljava/lang/Object;

    move-result-object v4

    .line 242
    monitor-enter v4

    .line 259
    :try_start_49
    sget-object v5, Lo/parseDigitsRecursive;->AudioAttributesCompatParcelizer:Lo/parseDigitsRecursive$AudioAttributesCompatParcelizer;

    invoke-virtual {v5}, Lo/parseDigitsRecursive$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()Lo/parseDigitsRecursive;

    move-result-object v5

    .line 260
    invoke-static {v1, v3, v5}, Lo/toChars3;->IconCompatParcelizer(Lo/reportWeirdUCS4;Lo/tryMatch;Lo/parseDigitsRecursive;)Lo/reportWeirdUCS4;

    move-result-object v1

    check-cast v1, Lo/checkUTF16;

    const/4 v6, 0x1

    .line 254
    invoke-static {v1, v2, v0, v6}, Lo/flog10threeQuartersPow2;->AudioAttributesCompatParcelizer(Lo/checkUTF16;ILo/AbstractFloatValueParser;Z)Z

    move-result v0
    :try_end_5a
    .catchall {:try_start_49 .. :try_end_5a} :catchall_61

    .line 242
    monitor-exit v4

    .line 262
    invoke-static {v5, v3}, Lo/toChars3;->AudioAttributesCompatParcelizer(Lo/parseDigitsRecursive;Lo/tryMatch;)V

    if-eqz v0, :cond_3

    return-void

    :catchall_61
    move-exception p0

    .line 242
    monitor-exit v4

    throw p0

    :catchall_64
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public final add(Ljava/lang/Object;)Z
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 197
    move-object v0, p0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 202
    :cond_3
    invoke-static {}, Lo/flog10threeQuartersPow2;->IconCompatParcelizer()Ljava/lang/Object;

    move-result-object v0

    .line 203
    monitor-enter v0

    .line 205
    :try_start_8
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->write()Lo/reportWeirdUCS4;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lo/checkUTF16;

    check-cast v1, Lo/reportWeirdUCS4;

    .line 206
    invoke-static {v1}, Lo/toChars3;->IconCompatParcelizer(Lo/reportWeirdUCS4;)Lo/reportWeirdUCS4;

    move-result-object v1

    check-cast v1, Lo/checkUTF16;

    .line 207
    invoke-virtual {v1}, Lo/checkUTF16;->write()I

    move-result v2

    .line 208
    invoke-virtual {v1}, Lo/checkUTF16;->read()Lo/AbstractFloatValueParser;

    move-result-object v1

    .line 209
    sget-object v3, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;
    :try_end_25
    .catchall {:try_start_8 .. :try_end_25} :catchall_65

    .line 203
    monitor-exit v0

    .line 210
    invoke-static {v1}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    .line 107
    invoke-interface {v1, p1}, Lo/AbstractFloatValueParser;->write(Ljava/lang/Object;)Lo/AbstractFloatValueParser;

    move-result-object v0

    .line 211
    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_35

    const/4 p0, 0x0

    return p0

    .line 216
    :cond_35
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->write()Lo/reportWeirdUCS4;

    move-result-object v1

    const-string v3, ""

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lo/checkUTF16;

    check-cast v1, Lo/reportWeirdUCS4;

    move-object v3, p0

    check-cast v3, Lo/tryMatch;

    .line 219
    invoke-static {}, Lo/toChars3;->MediaBrowserCompatMediaItem()Ljava/lang/Object;

    move-result-object v4

    .line 203
    monitor-enter v4

    .line 220
    :try_start_4a
    sget-object v5, Lo/parseDigitsRecursive;->AudioAttributesCompatParcelizer:Lo/parseDigitsRecursive$AudioAttributesCompatParcelizer;

    invoke-virtual {v5}, Lo/parseDigitsRecursive$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()Lo/parseDigitsRecursive;

    move-result-object v5

    .line 221
    invoke-static {v1, v3, v5}, Lo/toChars3;->IconCompatParcelizer(Lo/reportWeirdUCS4;Lo/tryMatch;Lo/parseDigitsRecursive;)Lo/reportWeirdUCS4;

    move-result-object v1

    check-cast v1, Lo/checkUTF16;

    const/4 v6, 0x1

    .line 215
    invoke-static {v1, v2, v0, v6}, Lo/flog10threeQuartersPow2;->AudioAttributesCompatParcelizer(Lo/checkUTF16;ILo/AbstractFloatValueParser;Z)Z

    move-result v0
    :try_end_5b
    .catchall {:try_start_4a .. :try_end_5b} :catchall_62

    .line 203
    monitor-exit v4

    .line 223
    invoke-static {v5, v3}, Lo/toChars3;->AudioAttributesCompatParcelizer(Lo/parseDigitsRecursive;Lo/tryMatch;)V

    if-eqz v0, :cond_3

    return v6

    :catchall_62
    move-exception p0

    .line 203
    monitor-exit v4

    throw p0

    :catchall_65
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+TT;>;)Z"
        }
    .end annotation

    .line 111
    new-instance v0, Lo/flog10pow2;

    invoke-direct {v0, p1, p2}, Lo/flog10pow2;-><init>(ILjava/util/Collection;)V

    invoke-static {p0, v0}, Lo/flog10threeQuartersPow2;->write(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lo/getAnswerMap;)Z

    move-result p0

    return p0
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TT;>;)Z"
        }
    .end annotation

    .line 274
    move-object v0, p0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 279
    :cond_3
    invoke-static {}, Lo/flog10threeQuartersPow2;->IconCompatParcelizer()Ljava/lang/Object;

    move-result-object v0

    .line 280
    monitor-enter v0

    .line 282
    :try_start_8
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->write()Lo/reportWeirdUCS4;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lo/checkUTF16;

    check-cast v1, Lo/reportWeirdUCS4;

    .line 283
    invoke-static {v1}, Lo/toChars3;->IconCompatParcelizer(Lo/reportWeirdUCS4;)Lo/reportWeirdUCS4;

    move-result-object v1

    check-cast v1, Lo/checkUTF16;

    .line 284
    invoke-virtual {v1}, Lo/checkUTF16;->write()I

    move-result v2

    .line 285
    invoke-virtual {v1}, Lo/checkUTF16;->read()Lo/AbstractFloatValueParser;

    move-result-object v1

    .line 286
    sget-object v3, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;
    :try_end_25
    .catchall {:try_start_8 .. :try_end_25} :catchall_65

    .line 280
    monitor-exit v0

    .line 287
    invoke-static {v1}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    .line 116
    invoke-interface {v1, p1}, Lo/AbstractFloatValueParser;->IconCompatParcelizer(Ljava/util/Collection;)Lo/AbstractFloatValueParser;

    move-result-object v0

    .line 288
    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_35

    const/4 p0, 0x0

    return p0

    .line 293
    :cond_35
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->write()Lo/reportWeirdUCS4;

    move-result-object v1

    const-string v3, ""

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lo/checkUTF16;

    check-cast v1, Lo/reportWeirdUCS4;

    move-object v3, p0

    check-cast v3, Lo/tryMatch;

    .line 296
    invoke-static {}, Lo/toChars3;->MediaBrowserCompatMediaItem()Ljava/lang/Object;

    move-result-object v4

    .line 280
    monitor-enter v4

    .line 297
    :try_start_4a
    sget-object v5, Lo/parseDigitsRecursive;->AudioAttributesCompatParcelizer:Lo/parseDigitsRecursive$AudioAttributesCompatParcelizer;

    invoke-virtual {v5}, Lo/parseDigitsRecursive$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()Lo/parseDigitsRecursive;

    move-result-object v5

    .line 298
    invoke-static {v1, v3, v5}, Lo/toChars3;->IconCompatParcelizer(Lo/reportWeirdUCS4;Lo/tryMatch;Lo/parseDigitsRecursive;)Lo/reportWeirdUCS4;

    move-result-object v1

    check-cast v1, Lo/checkUTF16;

    const/4 v6, 0x1

    .line 292
    invoke-static {v1, v2, v0, v6}, Lo/flog10threeQuartersPow2;->AudioAttributesCompatParcelizer(Lo/checkUTF16;ILo/AbstractFloatValueParser;Z)Z

    move-result v0
    :try_end_5b
    .catchall {:try_start_4a .. :try_end_5b} :catchall_62

    .line 280
    monitor-exit v4

    .line 300
    invoke-static {v5, v3}, Lo/toChars3;->AudioAttributesCompatParcelizer(Lo/parseDigitsRecursive;Lo/tryMatch;)V

    if-eqz v0, :cond_3

    return v6

    :catchall_62
    move-exception p0

    .line 280
    monitor-exit v4

    throw p0

    :catchall_65
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public final clear()V
    .registers 6

    .line 309
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->write()Lo/reportWeirdUCS4;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lo/checkUTF16;

    check-cast v0, Lo/reportWeirdUCS4;

    check-cast p0, Lo/tryMatch;

    .line 312
    invoke-static {}, Lo/toChars3;->MediaBrowserCompatMediaItem()Ljava/lang/Object;

    move-result-object v1

    .line 313
    monitor-enter v1

    .line 314
    :try_start_14
    sget-object v2, Lo/parseDigitsRecursive;->AudioAttributesCompatParcelizer:Lo/parseDigitsRecursive$AudioAttributesCompatParcelizer;

    invoke-virtual {v2}, Lo/parseDigitsRecursive$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()Lo/parseDigitsRecursive;

    move-result-object v2

    .line 315
    invoke-static {v0, p0, v2}, Lo/toChars3;->IconCompatParcelizer(Lo/reportWeirdUCS4;Lo/tryMatch;Lo/parseDigitsRecursive;)Lo/reportWeirdUCS4;

    move-result-object v0

    check-cast v0, Lo/checkUTF16;

    .line 316
    invoke-static {}, Lo/flog10threeQuartersPow2;->IconCompatParcelizer()Ljava/lang/Object;

    move-result-object v3

    .line 313
    monitor-enter v3
    :try_end_25
    .catchall {:try_start_14 .. :try_end_25} :catchall_47

    .line 317
    :try_start_25
    invoke-static {}, Lo/reportStrangeStream;->read()Lo/AbstractFloatValueParser;

    move-result-object v4

    invoke-virtual {v0, v4}, Lo/checkUTF16;->RemoteActionCompatParcelizer(Lo/AbstractFloatValueParser;)V

    .line 318
    invoke-virtual {v0}, Lo/checkUTF16;->write()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v0, v4}, Lo/checkUTF16;->write(I)V

    .line 319
    invoke-virtual {v0}, Lo/checkUTF16;->AudioAttributesCompatParcelizer()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v0, v4}, Lo/checkUTF16;->IconCompatParcelizer(I)V
    :try_end_3e
    .catchall {:try_start_25 .. :try_end_3e} :catchall_44

    .line 313
    monitor-exit v3

    monitor-exit v1

    .line 321
    invoke-static {v2, p0}, Lo/toChars3;->AudioAttributesCompatParcelizer(Lo/parseDigitsRecursive;Lo/tryMatch;)V

    return-void

    :catchall_44
    move-exception p0

    .line 313
    :try_start_45
    monitor-exit v3

    throw p0
    :try_end_47
    .catchall {:try_start_45 .. :try_end_47} :catchall_47

    :catchall_47
    move-exception p0

    monitor-exit v1

    throw p0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .registers 2

    .line 74
    invoke-static {p0}, Lo/flog10threeQuartersPow2;->RemoteActionCompatParcelizer(Landroidx/compose/runtime/snapshots/SnapshotStateList;)Lo/checkUTF16;

    move-result-object p0

    invoke-virtual {p0}, Lo/checkUTF16;->read()Lo/AbstractFloatValueParser;

    move-result-object p0

    invoke-interface {p0, p1}, Lo/AbstractFloatValueParser;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    .line 77
    invoke-static {p0}, Lo/flog10threeQuartersPow2;->RemoteActionCompatParcelizer(Landroidx/compose/runtime/snapshots/SnapshotStateList;)Lo/checkUTF16;

    move-result-object p0

    invoke-virtual {p0}, Lo/checkUTF16;->read()Lo/AbstractFloatValueParser;

    move-result-object p0

    invoke-interface {p0, p1}, Lo/AbstractFloatValueParser;->containsAll(Ljava/util/Collection;)Z

    move-result p0

    return p0
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final get(I)Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 79
    invoke-static {p0}, Lo/flog10threeQuartersPow2;->RemoteActionCompatParcelizer(Landroidx/compose/runtime/snapshots/SnapshotStateList;)Lo/checkUTF16;

    move-result-object p0

    invoke-virtual {p0}, Lo/checkUTF16;->read()Lo/AbstractFloatValueParser;

    move-result-object p0

    invoke-interface {p0, p1}, Lo/AbstractFloatValueParser;->get(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .registers 2

    .line 81
    invoke-static {p0}, Lo/flog10threeQuartersPow2;->RemoteActionCompatParcelizer(Landroidx/compose/runtime/snapshots/SnapshotStateList;)Lo/checkUTF16;

    move-result-object p0

    invoke-virtual {p0}, Lo/checkUTF16;->read()Lo/AbstractFloatValueParser;

    move-result-object p0

    invoke-interface {p0, p1}, Lo/AbstractFloatValueParser;->indexOf(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public final isEmpty()Z
    .registers 1

    .line 83
    invoke-static {p0}, Lo/flog10threeQuartersPow2;->RemoteActionCompatParcelizer(Landroidx/compose/runtime/snapshots/SnapshotStateList;)Lo/checkUTF16;

    move-result-object p0

    invoke-virtual {p0}, Lo/checkUTF16;->read()Lo/AbstractFloatValueParser;

    move-result-object p0

    invoke-interface {p0}, Lo/AbstractFloatValueParser;->isEmpty()Z

    move-result p0

    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    .line 85
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->listIterator()Ljava/util/ListIterator;

    move-result-object p0

    check-cast p0, Ljava/util/Iterator;

    return-object p0
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .registers 2

    .line 87
    invoke-static {p0}, Lo/flog10threeQuartersPow2;->RemoteActionCompatParcelizer(Landroidx/compose/runtime/snapshots/SnapshotStateList;)Lo/checkUTF16;

    move-result-object p0

    invoke-virtual {p0}, Lo/checkUTF16;->read()Lo/AbstractFloatValueParser;

    move-result-object p0

    invoke-interface {p0, p1}, Lo/AbstractFloatValueParser;->lastIndexOf(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ListIterator<",
            "TT;>;"
        }
    .end annotation

    .line 89
    new-instance v0, Lo/handleBOM;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/handleBOM;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;I)V

    check-cast v0, Ljava/util/ListIterator;

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator<",
            "TT;>;"
        }
    .end annotation

    .line 92
    new-instance v0, Lo/handleBOM;

    invoke-direct {v0, p0, p1}, Lo/handleBOM;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;I)V

    check-cast v0, Ljava/util/ListIterator;

    return-object v0
.end method

.method public final read(I)Ljava/lang/Object;
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 127
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 404
    move-object v1, p0

    check-cast v1, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 409
    :cond_7
    invoke-static {}, Lo/flog10threeQuartersPow2;->IconCompatParcelizer()Ljava/lang/Object;

    move-result-object v1

    .line 410
    monitor-enter v1

    .line 412
    :try_start_c
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->write()Lo/reportWeirdUCS4;

    move-result-object v2

    const-string v3, ""

    invoke-static {v2, v3}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lo/checkUTF16;

    check-cast v2, Lo/reportWeirdUCS4;

    .line 413
    invoke-static {v2}, Lo/toChars3;->IconCompatParcelizer(Lo/reportWeirdUCS4;)Lo/reportWeirdUCS4;

    move-result-object v2

    check-cast v2, Lo/checkUTF16;

    .line 414
    invoke-virtual {v2}, Lo/checkUTF16;->write()I

    move-result v3

    .line 415
    invoke-virtual {v2}, Lo/checkUTF16;->read()Lo/AbstractFloatValueParser;

    move-result-object v2

    .line 416
    sget-object v4, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;
    :try_end_29
    .catchall {:try_start_c .. :try_end_29} :catchall_68

    .line 410
    monitor-exit v1

    .line 417
    invoke-static {v2}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    .line 127
    invoke-interface {v2, p1}, Lo/AbstractFloatValueParser;->IconCompatParcelizer(I)Lo/AbstractFloatValueParser;

    move-result-object v1

    .line 418
    invoke-static {v1, v2}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_38

    return-object v0

    .line 423
    :cond_38
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->write()Lo/reportWeirdUCS4;

    move-result-object v2

    const-string v4, ""

    invoke-static {v2, v4}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lo/checkUTF16;

    check-cast v2, Lo/reportWeirdUCS4;

    move-object v4, p0

    check-cast v4, Lo/tryMatch;

    .line 426
    invoke-static {}, Lo/toChars3;->MediaBrowserCompatMediaItem()Ljava/lang/Object;

    move-result-object v5

    .line 410
    monitor-enter v5

    .line 427
    :try_start_4d
    sget-object v6, Lo/parseDigitsRecursive;->AudioAttributesCompatParcelizer:Lo/parseDigitsRecursive$AudioAttributesCompatParcelizer;

    invoke-virtual {v6}, Lo/parseDigitsRecursive$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()Lo/parseDigitsRecursive;

    move-result-object v6

    .line 428
    invoke-static {v2, v4, v6}, Lo/toChars3;->IconCompatParcelizer(Lo/reportWeirdUCS4;Lo/tryMatch;Lo/parseDigitsRecursive;)Lo/reportWeirdUCS4;

    move-result-object v2

    check-cast v2, Lo/checkUTF16;

    const/4 v7, 0x1

    .line 422
    invoke-static {v2, v3, v1, v7}, Lo/flog10threeQuartersPow2;->AudioAttributesCompatParcelizer(Lo/checkUTF16;ILo/AbstractFloatValueParser;Z)Z

    move-result v1
    :try_end_5e
    .catchall {:try_start_4d .. :try_end_5e} :catchall_65

    .line 410
    monitor-exit v5

    .line 430
    invoke-static {v6, v4}, Lo/toChars3;->AudioAttributesCompatParcelizer(Lo/parseDigitsRecursive;Lo/tryMatch;)V

    if-eqz v1, :cond_7

    return-object v0

    :catchall_65
    move-exception p0

    .line 410
    monitor-exit v5

    throw p0

    :catchall_68
    move-exception p0

    monitor-exit v1

    throw p0
.end method

.method public final remove(I)Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 36
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->read(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .registers 9

    .line 327
    move-object v0, p0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 332
    :cond_3
    invoke-static {}, Lo/flog10threeQuartersPow2;->IconCompatParcelizer()Ljava/lang/Object;

    move-result-object v0

    .line 333
    monitor-enter v0

    .line 335
    :try_start_8
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->write()Lo/reportWeirdUCS4;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lo/checkUTF16;

    check-cast v1, Lo/reportWeirdUCS4;

    .line 336
    invoke-static {v1}, Lo/toChars3;->IconCompatParcelizer(Lo/reportWeirdUCS4;)Lo/reportWeirdUCS4;

    move-result-object v1

    check-cast v1, Lo/checkUTF16;

    .line 337
    invoke-virtual {v1}, Lo/checkUTF16;->write()I

    move-result v2

    .line 338
    invoke-virtual {v1}, Lo/checkUTF16;->read()Lo/AbstractFloatValueParser;

    move-result-object v1

    .line 339
    sget-object v3, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;
    :try_end_25
    .catchall {:try_start_8 .. :try_end_25} :catchall_65

    .line 333
    monitor-exit v0

    .line 340
    invoke-static {v1}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    .line 121
    invoke-interface {v1, p1}, Lo/AbstractFloatValueParser;->IconCompatParcelizer(Ljava/lang/Object;)Lo/AbstractFloatValueParser;

    move-result-object v0

    .line 341
    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_35

    const/4 p0, 0x0

    return p0

    .line 346
    :cond_35
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->write()Lo/reportWeirdUCS4;

    move-result-object v1

    const-string v3, ""

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lo/checkUTF16;

    check-cast v1, Lo/reportWeirdUCS4;

    move-object v3, p0

    check-cast v3, Lo/tryMatch;

    .line 349
    invoke-static {}, Lo/toChars3;->MediaBrowserCompatMediaItem()Ljava/lang/Object;

    move-result-object v4

    .line 333
    monitor-enter v4

    .line 350
    :try_start_4a
    sget-object v5, Lo/parseDigitsRecursive;->AudioAttributesCompatParcelizer:Lo/parseDigitsRecursive$AudioAttributesCompatParcelizer;

    invoke-virtual {v5}, Lo/parseDigitsRecursive$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()Lo/parseDigitsRecursive;

    move-result-object v5

    .line 351
    invoke-static {v1, v3, v5}, Lo/toChars3;->IconCompatParcelizer(Lo/reportWeirdUCS4;Lo/tryMatch;Lo/parseDigitsRecursive;)Lo/reportWeirdUCS4;

    move-result-object v1

    check-cast v1, Lo/checkUTF16;

    const/4 v6, 0x1

    .line 345
    invoke-static {v1, v2, v0, v6}, Lo/flog10threeQuartersPow2;->AudioAttributesCompatParcelizer(Lo/checkUTF16;ILo/AbstractFloatValueParser;Z)Z

    move-result v0
    :try_end_5b
    .catchall {:try_start_4a .. :try_end_5b} :catchall_62

    .line 333
    monitor-exit v4

    .line 353
    invoke-static {v5, v3}, Lo/toChars3;->AudioAttributesCompatParcelizer(Lo/parseDigitsRecursive;Lo/tryMatch;)V

    if-eqz v0, :cond_3

    return v6

    :catchall_62
    move-exception p0

    .line 333
    monitor-exit v4

    throw p0

    :catchall_65
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    .line 364
    move-object v0, p0

    check-cast v0, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 369
    :cond_3
    invoke-static {}, Lo/flog10threeQuartersPow2;->IconCompatParcelizer()Ljava/lang/Object;

    move-result-object v0

    .line 370
    monitor-enter v0

    .line 372
    :try_start_8
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->write()Lo/reportWeirdUCS4;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lo/checkUTF16;

    check-cast v1, Lo/reportWeirdUCS4;

    .line 373
    invoke-static {v1}, Lo/toChars3;->IconCompatParcelizer(Lo/reportWeirdUCS4;)Lo/reportWeirdUCS4;

    move-result-object v1

    check-cast v1, Lo/checkUTF16;

    .line 374
    invoke-virtual {v1}, Lo/checkUTF16;->write()I

    move-result v2

    .line 375
    invoke-virtual {v1}, Lo/checkUTF16;->read()Lo/AbstractFloatValueParser;

    move-result-object v1

    .line 376
    sget-object v3, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;
    :try_end_25
    .catchall {:try_start_8 .. :try_end_25} :catchall_65

    .line 370
    monitor-exit v0

    .line 377
    invoke-static {v1}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    .line 124
    invoke-interface {v1, p1}, Lo/AbstractFloatValueParser;->write(Ljava/util/Collection;)Lo/AbstractFloatValueParser;

    move-result-object v0

    .line 378
    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_35

    const/4 p0, 0x0

    return p0

    .line 383
    :cond_35
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->write()Lo/reportWeirdUCS4;

    move-result-object v1

    const-string v3, ""

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lo/checkUTF16;

    check-cast v1, Lo/reportWeirdUCS4;

    move-object v3, p0

    check-cast v3, Lo/tryMatch;

    .line 386
    invoke-static {}, Lo/toChars3;->MediaBrowserCompatMediaItem()Ljava/lang/Object;

    move-result-object v4

    .line 370
    monitor-enter v4

    .line 387
    :try_start_4a
    sget-object v5, Lo/parseDigitsRecursive;->AudioAttributesCompatParcelizer:Lo/parseDigitsRecursive$AudioAttributesCompatParcelizer;

    invoke-virtual {v5}, Lo/parseDigitsRecursive$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()Lo/parseDigitsRecursive;

    move-result-object v5

    .line 388
    invoke-static {v1, v3, v5}, Lo/toChars3;->IconCompatParcelizer(Lo/reportWeirdUCS4;Lo/tryMatch;Lo/parseDigitsRecursive;)Lo/reportWeirdUCS4;

    move-result-object v1

    check-cast v1, Lo/checkUTF16;

    const/4 v6, 0x1

    .line 382
    invoke-static {v1, v2, v0, v6}, Lo/flog10threeQuartersPow2;->AudioAttributesCompatParcelizer(Lo/checkUTF16;ILo/AbstractFloatValueParser;Z)Z

    move-result v0
    :try_end_5b
    .catchall {:try_start_4a .. :try_end_5b} :catchall_62

    .line 370
    monitor-exit v4

    .line 390
    invoke-static {v5, v3}, Lo/toChars3;->AudioAttributesCompatParcelizer(Lo/parseDigitsRecursive;Lo/tryMatch;)V

    if-eqz v0, :cond_3

    return v6

    :catchall_62
    move-exception p0

    .line 370
    monitor-exit v4

    throw p0

    :catchall_65
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    .line 129
    new-instance v0, Lo/FloatToDecimal;

    invoke-direct {v0, p1}, Lo/FloatToDecimal;-><init>(Ljava/util/Collection;)V

    invoke-static {p0, v0}, Lo/flog10threeQuartersPow2;->write(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lo/getAnswerMap;)Z

    move-result p0

    return p0
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)TT;"
        }
    .end annotation

    .line 134
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 441
    move-object v1, p0

    check-cast v1, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 446
    :cond_7
    invoke-static {}, Lo/flog10threeQuartersPow2;->IconCompatParcelizer()Ljava/lang/Object;

    move-result-object v1

    .line 447
    monitor-enter v1

    .line 449
    :try_start_c
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->write()Lo/reportWeirdUCS4;

    move-result-object v2

    const-string v3, ""

    invoke-static {v2, v3}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lo/checkUTF16;

    check-cast v2, Lo/reportWeirdUCS4;

    .line 450
    invoke-static {v2}, Lo/toChars3;->IconCompatParcelizer(Lo/reportWeirdUCS4;)Lo/reportWeirdUCS4;

    move-result-object v2

    check-cast v2, Lo/checkUTF16;

    .line 451
    invoke-virtual {v2}, Lo/checkUTF16;->write()I

    move-result v3

    .line 452
    invoke-virtual {v2}, Lo/checkUTF16;->read()Lo/AbstractFloatValueParser;

    move-result-object v2

    .line 453
    sget-object v4, Lo/getShowPopup;->INSTANCE:Lo/getShowPopup;
    :try_end_29
    .catchall {:try_start_c .. :try_end_29} :catchall_68

    .line 447
    monitor-exit v1

    .line 454
    invoke-static {v2}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;)V

    .line 134
    invoke-interface {v2, p1, p2}, Lo/AbstractFloatValueParser;->IconCompatParcelizer(ILjava/lang/Object;)Lo/AbstractFloatValueParser;

    move-result-object v1

    .line 455
    invoke-static {v1, v2}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_38

    return-object v0

    .line 460
    :cond_38
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->write()Lo/reportWeirdUCS4;

    move-result-object v2

    const-string v4, ""

    invoke-static {v2, v4}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lo/checkUTF16;

    check-cast v2, Lo/reportWeirdUCS4;

    move-object v4, p0

    check-cast v4, Lo/tryMatch;

    .line 463
    invoke-static {}, Lo/toChars3;->MediaBrowserCompatMediaItem()Ljava/lang/Object;

    move-result-object v5

    .line 447
    monitor-enter v5

    .line 464
    :try_start_4d
    sget-object v6, Lo/parseDigitsRecursive;->AudioAttributesCompatParcelizer:Lo/parseDigitsRecursive$AudioAttributesCompatParcelizer;

    invoke-virtual {v6}, Lo/parseDigitsRecursive$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()Lo/parseDigitsRecursive;

    move-result-object v6

    .line 465
    invoke-static {v2, v4, v6}, Lo/toChars3;->IconCompatParcelizer(Lo/reportWeirdUCS4;Lo/tryMatch;Lo/parseDigitsRecursive;)Lo/reportWeirdUCS4;

    move-result-object v2

    check-cast v2, Lo/checkUTF16;

    const/4 v7, 0x0

    .line 459
    invoke-static {v2, v3, v1, v7}, Lo/flog10threeQuartersPow2;->AudioAttributesCompatParcelizer(Lo/checkUTF16;ILo/AbstractFloatValueParser;Z)Z

    move-result v1
    :try_end_5e
    .catchall {:try_start_4d .. :try_end_5e} :catchall_65

    .line 447
    monitor-exit v5

    .line 467
    invoke-static {v6, v4}, Lo/toChars3;->AudioAttributesCompatParcelizer(Lo/parseDigitsRecursive;Lo/tryMatch;)V

    if-eqz v1, :cond_7

    return-object v0

    :catchall_65
    move-exception p0

    .line 447
    monitor-exit v5

    throw p0

    :catchall_68
    move-exception p0

    monitor-exit v1

    throw p0
.end method

.method public final size()I
    .registers 1

    .line 36
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->AudioAttributesCompatParcelizer()I

    move-result p0

    return p0
.end method

.method public final subList(II)Ljava/util/List;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    if-ltz p1, :cond_b

    if-gt p1, p2, :cond_b

    .line 95
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    move-result v0

    if-gt p2, v0, :cond_b

    goto :goto_10

    .line 190
    :cond_b
    const-string v0, "fromIndex or toIndex are out of bounds"

    invoke-static {v0}, Lo/getInputCodeUtf8JsNames;->write(Ljava/lang/String;)V

    .line 98
    :goto_10
    new-instance v0, Lo/skipSpace;

    invoke-direct {v0, p0, p1, p2}, Lo/skipSpace;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;II)V

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .registers 1

    .line 535
    check-cast p0, Ljava/util/Collection;

    invoke-static {p0}, Lo/markCompletelambda1;->read(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .line 536
    check-cast p0, Ljava/util/Collection;

    invoke-static {p0, p1}, Lo/markCompletelambda1;->RemoteActionCompatParcelizer(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .registers 4

    .line 103
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->write()Lo/reportWeirdUCS4;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->read(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lo/checkUTF16;

    check-cast v0, Lo/reportWeirdUCS4;

    .line 193
    invoke-static {v0}, Lo/toChars3;->IconCompatParcelizer(Lo/reportWeirdUCS4;)Lo/reportWeirdUCS4;

    move-result-object v0

    check-cast v0, Lo/checkUTF16;

    .line 104
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SnapshotStateList(value="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lo/checkUTF16;->read()Lo/AbstractFloatValueParser;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")@"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final write()Lo/reportWeirdUCS4;
    .registers 1

    .line 45
    iget-object p0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateList;->RemoteActionCompatParcelizer:Lo/reportWeirdUCS4;

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 5

    .line 157
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->RemoteActionCompatParcelizer()Ljava/util/List;

    move-result-object p0

    .line 158
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p2

    .line 159
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x0

    :goto_c
    if-ge v0, p2, :cond_18

    .line 160
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_c

    :cond_18
    return-void
.end method

###### Class androidx.compose.runtime.snapshots.SnapshotStateList.AudioAttributesCompatParcelizer (androidx.compose.runtime.snapshots.SnapshotStateList$AudioAttributesCompatParcelizer)
.class public final Landroidx/compose/runtime/snapshots/SnapshotStateList$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/runtime/snapshots/SnapshotStateList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$ClassLoaderCreator<",
        "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0010\u0011\n\u0000\u0008\n\u0018\u00002\u0010\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001J)\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\'\u0010\u0008\u001a\u0012\u0012\u000e\u0012\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\r2\u0006\u0010\u0005\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\u000e"
    }
    d2 = {
        "Landroidx/compose/runtime/snapshots/SnapshotStateList$AudioAttributesCompatParcelizer;",
        "Landroid/os/Parcelable$ClassLoaderCreator;",
        "Landroidx/compose/runtime/snapshots/SnapshotStateList;",
        "",
        "Landroid/os/Parcel;",
        "p0",
        "Ljava/lang/ClassLoader;",
        "p1",
        "IconCompatParcelizer",
        "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/compose/runtime/snapshots/SnapshotStateList;",
        "AudioAttributesCompatParcelizer",
        "(Landroid/os/Parcel;)Landroidx/compose/runtime/snapshots/SnapshotStateList;",
        "",
        "",
        "(I)[Landroidx/compose/runtime/snapshots/SnapshotStateList;"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic IconCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;I)Ljava/lang/Object;
    .registers 3

    .line 185
    invoke-static {p0, p1, p2}, Landroidx/compose/runtime/snapshots/SnapshotStateList$AudioAttributesCompatParcelizer;->read(Landroid/os/Parcel;Ljava/lang/ClassLoader;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final read(Landroid/os/Parcel;Ljava/lang/ClassLoader;I)Ljava/lang/Object;
    .registers 3

    .line 178
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            ")",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 182
    invoke-virtual {p0, p1, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList$AudioAttributesCompatParcelizer;->IconCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object p0

    return-object p0
.end method

.method public final IconCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            "Ljava/lang/ClassLoader;",
            ")",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    if-nez p2, :cond_a

    .line 176
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p2

    .line 177
    :cond_a
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p0

    new-instance v0, Lo/multiplyHigh;

    invoke-direct {v0, p1, p2}, Lo/multiplyHigh;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    invoke-static {p0, v0}, Lo/flog10threeQuartersPow2;->IconCompatParcelizer(ILo/getAnswerMap;)Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object p0

    return-object p0
.end method

.method public final IconCompatParcelizer(I)[Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)[",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 184
    new-array p0, p1, [Landroidx/compose/runtime/snapshots/SnapshotStateList;

    return-object p0
.end method

.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 171
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .registers 3

    .line 171
    invoke-virtual {p0, p1, p2}, Landroidx/compose/runtime/snapshots/SnapshotStateList$AudioAttributesCompatParcelizer;->IconCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 171
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList$AudioAttributesCompatParcelizer;->IconCompatParcelizer(I)[Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.multiplyHigh (o.multiplyHigh)
.class public final synthetic Lo/multiplyHigh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getAnswerMap;


# instance fields
.field public final synthetic IconCompatParcelizer:Landroid/os/Parcel;

.field public final synthetic write:Ljava/lang/ClassLoader;


# direct methods
.method public synthetic constructor <init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
    .registers 3

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/multiplyHigh;->IconCompatParcelizer:Landroid/os/Parcel;

    iput-object p2, p0, Lo/multiplyHigh;->write:Ljava/lang/ClassLoader;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 0
    iget-object v0, p0, Lo/multiplyHigh;->IconCompatParcelizer:Landroid/os/Parcel;

    iget-object p0, p0, Lo/multiplyHigh;->write:Ljava/lang/ClassLoader;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-static {v0, p0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList$AudioAttributesCompatParcelizer;->IconCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.compose.runtime.snapshots.SnapshotStateList.RemoteActionCompatParcelizer (androidx.compose.runtime.snapshots.SnapshotStateList$RemoteActionCompatParcelizer)
.class public final Landroidx/compose/runtime/snapshots/SnapshotStateList$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/runtime/snapshots/SnapshotStateList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RemoteActionCompatParcelizer"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001f\u0010\u0006\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u00048\u0006\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Landroidx/compose/runtime/snapshots/SnapshotStateList$RemoteActionCompatParcelizer;",
        "",
        "<init>",
        "()V",
        "Landroid/os/Parcelable$Creator;",
        "Landroidx/compose/runtime/snapshots/SnapshotStateList;",
        "CREATOR",
        "Landroid/os/Parcelable$Creator;"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 167
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 2

    .line 168
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList$RemoteActionCompatParcelizer;-><init>()V

    return-void
.end method

###### Class kotlin.FloatToDecimal (o.FloatToDecimal)
.class public final synthetic Lo/FloatToDecimal;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getAnswerMap;


# instance fields
.field public final synthetic write:Ljava/util/Collection;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Collection;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/FloatToDecimal;->write:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 0
    iget-object p0, p0, Lo/FloatToDecimal;->write:Ljava/util/Collection;

    check-cast p1, Ljava/util/List;

    invoke-static {p0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->AudioAttributesCompatParcelizer(Ljava/util/Collection;Ljava/util/List;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.flog10pow2 (o.flog10pow2)
.class public final synthetic Lo/flog10pow2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getAnswerMap;


# instance fields
.field public final synthetic RemoteActionCompatParcelizer:I

.field public final synthetic read:Ljava/util/Collection;


# direct methods
.method public synthetic constructor <init>(ILjava/util/Collection;)V
    .registers 3

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lo/flog10pow2;->RemoteActionCompatParcelizer:I

    iput-object p2, p0, Lo/flog10pow2;->read:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 0
    iget v0, p0, Lo/flog10pow2;->RemoteActionCompatParcelizer:I

    iget-object p0, p0, Lo/flog10pow2;->read:Ljava/util/Collection;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->write(ILjava/util/Collection;Ljava/util/List;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method
