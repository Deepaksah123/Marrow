###### Class androidx.media3.extractor.metadata.scte35.SpliceNullCommand (androidx.media3.extractor.metadata.scte35.SpliceNullCommand)
.class public final Landroidx/media3/extractor/metadata/scte35/SpliceNullCommand;
.super Landroidx/media3/extractor/metadata/scte35/SpliceCommand;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/media3/extractor/metadata/scte35/SpliceNullCommand;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 32
    new-instance v0, Landroidx/media3/extractor/metadata/scte35/SpliceNullCommand$2;

    invoke-direct {v0}, Landroidx/media3/extractor/metadata/scte35/SpliceNullCommand$2;-><init>()V

    sput-object v0, Landroidx/media3/extractor/metadata/scte35/SpliceNullCommand;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 23
    invoke-direct {p0}, Landroidx/media3/extractor/metadata/scte35/SpliceCommand;-><init>()V

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    return-void
.end method

###### Class androidx.media3.extractor.metadata.scte35.SpliceNullCommand.AnonymousClass2 (androidx.media3.extractor.metadata.scte35.SpliceNullCommand$2)
.class final Landroidx/media3/extractor/metadata/scte35/SpliceNullCommand$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/extractor/metadata/scte35/SpliceNullCommand;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/media3/extractor/metadata/scte35/SpliceNullCommand;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static read()Landroidx/media3/extractor/metadata/scte35/SpliceNullCommand;
    .registers 1

    .line 37
    new-instance v0, Landroidx/media3/extractor/metadata/scte35/SpliceNullCommand;

    invoke-direct {v0}, Landroidx/media3/extractor/metadata/scte35/SpliceNullCommand;-><init>()V

    return-object v0
.end method

.method private static write(I)[Landroidx/media3/extractor/metadata/scte35/SpliceNullCommand;
    .registers 1

    .line 42
    new-array p0, p0, [Landroidx/media3/extractor/metadata/scte35/SpliceNullCommand;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 33
    invoke-static {}, Landroidx/media3/extractor/metadata/scte35/SpliceNullCommand$2;->read()Landroidx/media3/extractor/metadata/scte35/SpliceNullCommand;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 33
    invoke-static {p1}, Landroidx/media3/extractor/metadata/scte35/SpliceNullCommand$2;->write(I)[Landroidx/media3/extractor/metadata/scte35/SpliceNullCommand;

    move-result-object p0

    return-object p0
.end method
