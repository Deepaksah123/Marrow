###### Class androidx.compose.runtime.ParcelableSnapshotMutableLongState (androidx.compose.runtime.ParcelableSnapshotMutableLongState)
.class public final Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;
.super Lo/_initialByteBufSize;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/runtime/ParcelableSnapshotMutableLongState$write;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u000fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000e"
    }
    d2 = {
        "Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;",
        "Lo/_initialByteBufSize;",
        "Landroid/os/Parcelable;",
        "",
        "p0",
        "<init>",
        "(J)V",
        "Landroid/os/Parcel;",
        "",
        "p1",
        "",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "describeContents",
        "()I",
        "write"
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
            "Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;",
            ">;"
        }
    .end annotation
.end field

.field public static final write:Landroidx/compose/runtime/ParcelableSnapshotMutableLongState$write;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Landroidx/compose/runtime/ParcelableSnapshotMutableLongState$write;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/runtime/ParcelableSnapshotMutableLongState$write;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    sput-object v0, Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;->write:Landroidx/compose/runtime/ParcelableSnapshotMutableLongState$write;

    .line 42
    new-instance v0, Landroidx/compose/runtime/ParcelableSnapshotMutableLongState$AudioAttributesCompatParcelizer;

    invoke-direct {v0}, Landroidx/compose/runtime/ParcelableSnapshotMutableLongState$AudioAttributesCompatParcelizer;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(J)V
    .registers 3

    .line 26
    invoke-direct {p0, p1, p2}, Lo/_initialByteBufSize;-><init>(J)V

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 5

    .line 31
    invoke-virtual {p0}, Lo/_initialByteBufSize;->AudioAttributesCompatParcelizer()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method

###### Class androidx.compose.runtime.ParcelableSnapshotMutableLongState.AudioAttributesCompatParcelizer (androidx.compose.runtime.ParcelableSnapshotMutableLongState$AudioAttributesCompatParcelizer)
.class public final Landroidx/compose/runtime/ParcelableSnapshotMutableLongState$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0010\u0011\n\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00082\u0006\u0010\u0004\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\t"
    }
    d2 = {
        "Landroidx/compose/runtime/ParcelableSnapshotMutableLongState$AudioAttributesCompatParcelizer;",
        "Landroid/os/Parcelable$Creator;",
        "Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;",
        "Landroid/os/Parcel;",
        "p0",
        "RemoteActionCompatParcelizer",
        "(Landroid/os/Parcel;)Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;",
        "",
        "",
        "(I)[Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;"
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

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Landroid/os/Parcel;)Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;
    .registers 4

    .line 44
    new-instance p0, Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;-><init>(J)V

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer(I)[Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;
    .registers 2

    .line 48
    new-array p0, p1, [Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;

    return-object p0
.end method

.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 42
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/ParcelableSnapshotMutableLongState$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/os/Parcel;)Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 42
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/ParcelableSnapshotMutableLongState$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer(I)[Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.compose.runtime.ParcelableSnapshotMutableLongState.Companion (androidx.compose.runtime.ParcelableSnapshotMutableLongState$write)
.class public final Landroidx/compose/runtime/ParcelableSnapshotMutableLongState$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "write"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Landroidx/compose/runtime/ParcelableSnapshotMutableLongState$write;",
        "",
        "<init>",
        "()V",
        "Landroid/os/Parcelable$Creator;",
        "Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;",
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

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 2

    .line 39
    invoke-direct {p0}, Landroidx/compose/runtime/ParcelableSnapshotMutableLongState$write;-><init>()V

    return-void
.end method
