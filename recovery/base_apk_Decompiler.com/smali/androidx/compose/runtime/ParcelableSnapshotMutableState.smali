###### Class androidx.compose.runtime.ParcelableSnapshotMutableState (androidx.compose.runtime.ParcelableSnapshotMutableState)
.class public final Landroidx/compose/runtime/ParcelableSnapshotMutableState;
.super Lo/_appendNumeric;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/runtime/ParcelableSnapshotMutableState$read;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lo/_appendNumeric<",
        "TT;>;",
        "Landroid/os/Parcelable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u0000 \u0010*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0010B\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000f"
    }
    d2 = {
        "Landroidx/compose/runtime/ParcelableSnapshotMutableState;",
        "T",
        "Lo/_appendNumeric;",
        "Landroid/os/Parcelable;",
        "p0",
        "Lo/quoteAsUTF8;",
        "p1",
        "<init>",
        "(Ljava/lang/Object;Lo/quoteAsUTF8;)V",
        "Landroid/os/Parcel;",
        "",
        "",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "describeContents",
        "()I",
        "read"
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
            "Landroidx/compose/runtime/ParcelableSnapshotMutableState<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final read:Landroidx/compose/runtime/ParcelableSnapshotMutableState$read;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Landroidx/compose/runtime/ParcelableSnapshotMutableState$read;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/runtime/ParcelableSnapshotMutableState$read;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    sput-object v0, Landroidx/compose/runtime/ParcelableSnapshotMutableState;->read:Landroidx/compose/runtime/ParcelableSnapshotMutableState$read;

    .line 60
    new-instance v0, Landroidx/compose/runtime/ParcelableSnapshotMutableState$RemoteActionCompatParcelizer;

    invoke-direct {v0}, Landroidx/compose/runtime/ParcelableSnapshotMutableState$RemoteActionCompatParcelizer;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Landroidx/compose/runtime/ParcelableSnapshotMutableState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lo/quoteAsUTF8;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lo/quoteAsUTF8<",
            "TT;>;)V"
        }
    .end annotation

    .line 29
    invoke-direct {p0, p1, p2}, Lo/_appendNumeric;-><init>(Ljava/lang/Object;Lo/quoteAsUTF8;)V

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 34
    invoke-virtual {p0}, Lo/_appendNumeric;->read()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 36
    invoke-virtual {p0}, Lo/_appendNumeric;->n_()Lo/quoteAsUTF8;

    move-result-object p0

    .line 37
    invoke-static {}, Lo/_qbuf;->AudioAttributesCompatParcelizer()Lo/quoteAsUTF8;

    move-result-object p2

    invoke-static {p0, p2}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_17

    const/4 p0, 0x0

    goto :goto_2e

    .line 38
    :cond_17
    invoke-static {}, Lo/_qbuf;->RemoteActionCompatParcelizer()Lo/quoteAsUTF8;

    move-result-object p2

    invoke-static {p0, p2}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_23

    const/4 p0, 0x1

    goto :goto_2e

    .line 39
    :cond_23
    invoke-static {}, Lo/_qbuf;->read()Lo/quoteAsUTF8;

    move-result-object p2

    invoke-static {p0, p2}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_32

    const/4 p0, 0x2

    .line 35
    :goto_2e
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    .line 41
    :cond_32
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Only known types of MutableState\'s SnapshotMutationPolicy are supported"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

###### Class androidx.compose.runtime.ParcelableSnapshotMutableState.RemoteActionCompatParcelizer (androidx.compose.runtime.ParcelableSnapshotMutableState$RemoteActionCompatParcelizer)
.class public final Landroidx/compose/runtime/ParcelableSnapshotMutableState$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/runtime/ParcelableSnapshotMutableState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$ClassLoaderCreator<",
        "Landroidx/compose/runtime/ParcelableSnapshotMutableState<",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0010\u0011\n\u0002\u0008\u0002\u0008\n\u0018\u00002\u0010\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001J)\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\'\u0010\u000e\u001a\u0012\u0012\u000e\u0012\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\r2\u0006\u0010\u0005\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000f"
    }
    d2 = {
        "Landroidx/compose/runtime/ParcelableSnapshotMutableState$RemoteActionCompatParcelizer;",
        "Landroid/os/Parcelable$ClassLoaderCreator;",
        "Landroidx/compose/runtime/ParcelableSnapshotMutableState;",
        "",
        "Landroid/os/Parcel;",
        "p0",
        "Ljava/lang/ClassLoader;",
        "p1",
        "AudioAttributesCompatParcelizer",
        "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/compose/runtime/ParcelableSnapshotMutableState;",
        "write",
        "(Landroid/os/Parcel;)Landroidx/compose/runtime/ParcelableSnapshotMutableState;",
        "",
        "",
        "RemoteActionCompatParcelizer",
        "(I)[Landroidx/compose/runtime/ParcelableSnapshotMutableState;"
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

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/compose/runtime/ParcelableSnapshotMutableState;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            "Ljava/lang/ClassLoader;",
            ")",
            "Landroidx/compose/runtime/ParcelableSnapshotMutableState<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    if-nez p2, :cond_a

    .line 65
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p2

    :cond_a
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object p0

    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_3d

    const/4 p2, 0x1

    if-eq p1, p2, :cond_38

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1f

    .line 72
    invoke-static {}, Lo/_qbuf;->read()Lo/quoteAsUTF8;

    move-result-object p1

    goto :goto_41

    .line 75
    :cond_1f
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p2, "Unsupported MutableState policy "

    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " was restored"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 74
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 71
    :cond_38
    invoke-static {}, Lo/_qbuf;->RemoteActionCompatParcelizer()Lo/quoteAsUTF8;

    move-result-object p1

    goto :goto_41

    .line 70
    :cond_3d
    invoke-static {}, Lo/_qbuf;->AudioAttributesCompatParcelizer()Lo/quoteAsUTF8;

    move-result-object p1

    .line 67
    :goto_41
    new-instance p2, Landroidx/compose/runtime/ParcelableSnapshotMutableState;

    invoke-direct {p2, p0, p1}, Landroidx/compose/runtime/ParcelableSnapshotMutableState;-><init>(Ljava/lang/Object;Lo/quoteAsUTF8;)V

    return-object p2
.end method

.method public final RemoteActionCompatParcelizer(I)[Landroidx/compose/runtime/ParcelableSnapshotMutableState;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)[",
            "Landroidx/compose/runtime/ParcelableSnapshotMutableState<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 84
    new-array p0, p1, [Landroidx/compose/runtime/ParcelableSnapshotMutableState;

    return-object p0
.end method

.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 60
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/ParcelableSnapshotMutableState$RemoteActionCompatParcelizer;->write(Landroid/os/Parcel;)Landroidx/compose/runtime/ParcelableSnapshotMutableState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .registers 3

    .line 60
    invoke-virtual {p0, p1, p2}, Landroidx/compose/runtime/ParcelableSnapshotMutableState$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/compose/runtime/ParcelableSnapshotMutableState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 60
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/ParcelableSnapshotMutableState$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(I)[Landroidx/compose/runtime/ParcelableSnapshotMutableState;

    move-result-object p0

    return-object p0
.end method

.method public final write(Landroid/os/Parcel;)Landroidx/compose/runtime/ParcelableSnapshotMutableState;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            ")",
            "Landroidx/compose/runtime/ParcelableSnapshotMutableState<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 81
    invoke-virtual {p0, p1, v0}, Landroidx/compose/runtime/ParcelableSnapshotMutableState$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/compose/runtime/ParcelableSnapshotMutableState;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.compose.runtime.ParcelableSnapshotMutableState.Companion (androidx.compose.runtime.ParcelableSnapshotMutableState$read)
.class public final Landroidx/compose/runtime/ParcelableSnapshotMutableState$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/runtime/ParcelableSnapshotMutableState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "read"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001f\u0010\u0006\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u00048\u0006\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Landroidx/compose/runtime/ParcelableSnapshotMutableState$read;",
        "",
        "<init>",
        "()V",
        "Landroid/os/Parcelable$Creator;",
        "Landroidx/compose/runtime/ParcelableSnapshotMutableState;",
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

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 2

    .line 53
    invoke-direct {p0}, Landroidx/compose/runtime/ParcelableSnapshotMutableState$read;-><init>()V

    return-void
.end method
