###### Class androidx.compose.runtime.ParcelableSnapshotMutableFloatState (androidx.compose.runtime.ParcelableSnapshotMutableFloatState)
.class public final Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;
.super Lo/_convert;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState$AudioAttributesCompatParcelizer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u000fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000e"
    }
    d2 = {
        "Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;",
        "Lo/_convert;",
        "Landroid/os/Parcelable;",
        "",
        "p0",
        "<init>",
        "(F)V",
        "Landroid/os/Parcel;",
        "",
        "p1",
        "",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "describeContents",
        "()I",
        "AudioAttributesCompatParcelizer"
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
.field public static final AudioAttributesCompatParcelizer:Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState$AudioAttributesCompatParcelizer;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState$AudioAttributesCompatParcelizer;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState$AudioAttributesCompatParcelizer;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    sput-object v0, Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;->AudioAttributesCompatParcelizer:Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState$AudioAttributesCompatParcelizer;

    .line 42
    new-instance v0, Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState$IconCompatParcelizer;

    invoke-direct {v0}, Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState$IconCompatParcelizer;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(F)V
    .registers 2

    .line 26
    invoke-direct {p0, p1}, Lo/_convert;-><init>(F)V

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

    .line 31
    invoke-virtual {p0}, Lo/_convert;->AudioAttributesCompatParcelizer()F

    move-result p0

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeFloat(F)V

    return-void
.end method

###### Class androidx.compose.runtime.ParcelableSnapshotMutableFloatState.Companion (androidx.compose.runtime.ParcelableSnapshotMutableFloatState$AudioAttributesCompatParcelizer)
.class public final Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AudioAttributesCompatParcelizer"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState$AudioAttributesCompatParcelizer;",
        "",
        "<init>",
        "()V",
        "Landroid/os/Parcelable$Creator;",
        "Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;",
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
    invoke-direct {p0}, Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState$AudioAttributesCompatParcelizer;-><init>()V

    return-void
.end method

###### Class androidx.compose.runtime.ParcelableSnapshotMutableFloatState.IconCompatParcelizer (androidx.compose.runtime.ParcelableSnapshotMutableFloatState$IconCompatParcelizer)
.class public final Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0010\u0011\n\u0002\u0008\u0002\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00082\u0006\u0010\u0004\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n"
    }
    d2 = {
        "Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState$IconCompatParcelizer;",
        "Landroid/os/Parcelable$Creator;",
        "Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;",
        "Landroid/os/Parcel;",
        "p0",
        "RemoteActionCompatParcelizer",
        "(Landroid/os/Parcel;)Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;",
        "",
        "",
        "read",
        "(I)[Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;"
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
.method public final RemoteActionCompatParcelizer(Landroid/os/Parcel;)Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;
    .registers 2

    .line 44
    new-instance p0, Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result p1

    invoke-direct {p0, p1}, Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;-><init>(F)V

    return-object p0
.end method

.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 42
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState$IconCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/os/Parcel;)Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 42
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState$IconCompatParcelizer;->read(I)[Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;

    move-result-object p0

    return-object p0
.end method

.method public final read(I)[Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;
    .registers 2

    .line 48
    new-array p0, p1, [Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;

    return-object p0
.end method
